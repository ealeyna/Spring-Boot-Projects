package com.eylulaleynasahin.service.impl;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eylulaleynasahin.jwt.AuthResponse;
import com.eylulaleynasahin.jwt.JwtService;
import com.eylulaleynasahin.jwt.RefreshTokenRequest;
import com.eylulaleynasahin.model.RefreshToken;
import com.eylulaleynasahin.model.User;
import com.eylulaleynasahin.repository.RefreshTokenRepository;
import com.eylulaleynasahin.service.IRefreshTokenService;

@Service
public class RefreshTokenServiceImpl implements IRefreshTokenService{
	
	@Autowired
	private RefreshTokenRepository refreshTokenRepository;
	
	@Autowired
	private JwtService jwtService;
	
	public boolean isRefreshTokenExpired(Date expiredDate) {
		return new Date().before(expiredDate);
	}
	
	private RefreshToken createRefreshToken(User user) {
		RefreshToken refreshToken = new RefreshToken();
		refreshToken.setRefreshToken(UUID.randomUUID().toString());
		refreshToken.setExpireDate(new Date(System.currentTimeMillis()+1000*60*60*4));
		refreshToken.setUser(user);
		return refreshToken;
	}
	
	@Override
	public AuthResponse refreshToken(RefreshTokenRequest request) {
		Optional<RefreshToken> optional = refreshTokenRepository.findByRefreshToken(request.getRefreshToken());
		if(optional.isEmpty()) {
			System.out.println("REFRESH TOKEN IS INVALID : " + request.getRefreshToken());
		}
		RefreshToken refreshToken = optional.get();
		
		if(!isRefreshTokenExpired(refreshToken.getExpireDate())) {
			System.out.println("REFRESH TOKEN EXPIRE : " + request.getRefreshToken());
		}
		
		String accessToken = jwtService.generateToken(refreshToken.getUser());
		RefreshToken savedRefreshToken = refreshTokenRepository.save(createRefreshToken(refreshToken.getUser()));
		return new AuthResponse(accessToken,savedRefreshToken.getRefreshToken());
	}

}
