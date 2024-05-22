package com.app.small_finance.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.small_finance.dto.UserDto;
import com.app.small_finance.entity.User;
import com.app.small_finance.service.UserService;

@RequestMapping("/api/user")
@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/create")
	public void createUser(@RequestBody UserDto dto) {
		service.createUser(dto);
	}

	@GetMapping("/getById/{userId}")
	public Optional<User> getById(@PathVariable UUID userId) {
		return service.getById(userId);
	}

	@PutMapping("/updateUser")
	public void update(@RequestBody UserDto dto) {
		service.updateUser(dto);
	}

	@DeleteMapping("/delete/user/{userId}")
	public void deleteUser(@PathVariable UUID userId) {
		service.deleteUser(userId);
	}

}
