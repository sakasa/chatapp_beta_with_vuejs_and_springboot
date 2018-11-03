package com.chal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chal.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public boolean signin(@RequestParam("nickname") String nickname, @RequestParam("pincode") int pincode) {
		return loginService.signin(nickname, pincode);
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	@Transactional(readOnly = false)
	public boolean signup(@RequestParam("nickname") String nickname, @RequestParam("pincode") int pincode) {
		return loginService.signup(nickname, pincode);
	}
}
