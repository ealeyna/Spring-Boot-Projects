package com.eylulaleynasahin.service;

import com.eylulaleynasahin.jwt.AuthResponse;
import com.eylulaleynasahin.jwt.RefreshTokenRequest;

public interface IRefreshTokenService {

	public AuthResponse refreshToken(RefreshTokenRequest request);

}
