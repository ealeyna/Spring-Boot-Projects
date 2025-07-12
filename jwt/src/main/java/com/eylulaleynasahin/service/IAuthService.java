package com.eylulaleynasahin.service;

import com.eylulaleynasahin.dto.DtoUser;
import com.eylulaleynasahin.jwt.AuthRequest;
import com.eylulaleynasahin.jwt.AuthResponse;

public interface IAuthService {

	public DtoUser register(AuthRequest request);
	
	public AuthResponse authenticate(AuthRequest request);
}
