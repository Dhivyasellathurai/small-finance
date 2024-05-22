package com.app.small_finance.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.small_finance.dto.UserDto;
import com.app.small_finance.entity.User;
import com.app.small_finance.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public void createUser(UserDto dto) {
		User user = new User();
		user.setUserName(dto.getUserName());
		user.setPassword(dto.getPassword());
		user.setPhoneNo(dto.getPhoneNo());
		repository.save(user);
	}

	public Optional<User> getById(UUID userId) {
		Optional<User> userOptional = repository.findById(userId);
		if (userOptional.isPresent()) {
			return userOptional;
		} else {
			return null;
		}
	}

	public void updateUser(UserDto dto) {
		Optional<User> userOptional = getById(dto.getUserId());
		if (userOptional.isPresent()) {
			User user = userOptional.get();
			user.setUserName(dto.getUserName());
			user.setPassword(dto.getPassword());
			user.setPhoneNo(dto.getPhoneNo());
			repository.saveAndFlush(user);
		}
	}

	public void deleteUser(UUID userId) {
		Optional<User> userOptional = getById(userId);
		if (userOptional.isPresent()) {
			repository.deleteById(userId);
		}
	}
}