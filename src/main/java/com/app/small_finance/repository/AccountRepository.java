package com.app.small_finance.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.small_finance.entity.Account;

public interface AccountRepository extends JpaRepository<Account, UUID> {

	@Query(value = "from Account as ac where ac.accountNo=:accountNo")
	Optional<Account> getByAccountNo(@Param(value = "accountNo") String accountNo);
}
