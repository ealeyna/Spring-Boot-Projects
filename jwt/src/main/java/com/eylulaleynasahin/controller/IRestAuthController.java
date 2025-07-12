package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.DtoUser;
import com.eylulaleynasahin.jwt.AuthResponse;
import com.eylulaleynasahin.jwt.RefreshTokenRequest;
import com.eylulaleynasahin.jwt.AuthRequest;

public interface IRestAuthController {

	public DtoUser register(AuthRequest request);

	public AuthResponse authenticate(AuthRequest request);
	
	public AuthResponse refreshToken(RefreshTokenRequest request);

}