package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.entity.AuthUser;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api")
public class AuthUserController {
	@PostMapping("/authusers/validate")
	public AuthUser validate(@RequestBody AuthUser authUser) {
		return null;
	}
}
