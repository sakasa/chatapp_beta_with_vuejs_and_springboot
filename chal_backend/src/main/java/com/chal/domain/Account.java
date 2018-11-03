package com.chal.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	public Account() {

	}

	public Account(String nickname, int pincode) {
		this.nickname = nickname;
		this.pincode = pincode;
	}

	@Id
	@Column(length = 10, nullable = false)
	private String nickname;
	@Column(length = 4, nullable = false)
	private int pincode;

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getPincode() {
		return this.pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
