package com.eylulaleynasahin.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eylulaleynasahin.controller.IRestAuthController;
import com.eylulaleynasahin.dto.DtoUser;
import com.eylulaleynasahin.jwt.AuthRequest;
import com.eylulaleynasahin.jwt.AuthResponse;
import com.eylulaleynasahin.jwt.RefreshTokenRequest;
import com.eylulaleynasahin.service.IAuthService;
import com.eylulaleynasahin.service.IRefreshTokenService;

import jakarta.validation.Valid;

@RestController
public class RestAuthControllerImpl implements IRestAuthController{

	@Autowired
	private IAuthService authService;
	
	@Autowired
	private IRefreshTokenService refreshTokenService;
	
	@PostMapping("/register")
	@Override
	public DtoUser register(@Valid @RequestBody AuthRequest request) {
		return authService.register(request);
	}

	@PostMapping("/authenticate")
	@Override
	public AuthResponse authenticate(@Valid @RequestBody AuthRequest request) {
		return authService.authenticate(request);
	}

	@PostMapping("/refreshToken")
	@Override
	public AuthResponse refreshToken(@RequestBody RefreshTokenRequest request) {
		return refreshTokenService.refreshToken(request);
	}
}

