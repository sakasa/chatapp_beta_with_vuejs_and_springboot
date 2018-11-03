package com.chal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chal.domain.Account;

public interface AccountRepository extends JpaRepository<Account, String> {
	Account findByNicknameAndPincode(String nickname, int pincode);

}
