package com.chal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chal.domain.Account;
import com.chal.repository.AccountRepository;

@Service
public class LoginService {
	@Autowired
	private AccountRepository accountRepository;

	public boolean signin(String nickname, int pincode) {

		Account account = accountRepository.findByNicknameAndPincode(nickname, pincode);

		if (account == null) {
			return false;
		}

		return true;
	}

	public boolean signup(String nickname, int pincode) {
		Account account = accountRepository.findByNicknameAndPincode(nickname, pincode);
		if (account == null) {
			accountRepository.saveAndFlush(new Account(nickname, pincode));
			return true;
		}

		return false;
	}
}
