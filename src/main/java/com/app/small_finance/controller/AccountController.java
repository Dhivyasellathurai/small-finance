package com.app.small_finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.small_finance.entity.Account;
import com.app.small_finance.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/createAccount")
	public String createAccount(Account account) {
		return accountService.createAccount(account);
	}

	@PostMapping("/deposit")
	public Double deposite(@RequestBody Account account) {
		return accountService.deposit(account);
	}

	@GetMapping("/checkBalance/{accountNo}")
	public Object checkBalance(@PathVariable("accountNo") String accountNo) {
		return accountService.checkBalance(accountNo);
	}

	@PutMapping("/withDraw/{accountNo}/{amount}")
	public Object withDraw(@PathVariable("accountNo") String AccountNo, @PathVariable("amount") double amount) {
		return accountService.withDraw(AccountNo, amount);
	}

	@DeleteMapping("/deleteAccount/{accountNo}")
	public Object delete(@PathVariable("accountNo") String accountNo) {
		return accountService.deleteAccount(accountNo);
	}

}
