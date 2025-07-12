package com.eylulaleynasahin.service.impl;

import java.sql.Date;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.eylulaleynasahin.dto.DtoUser;
import com.eylulaleynasahin.jwt.AuthRequest;
import com.eylulaleynasahin.jwt.AuthResponse;
import com.eylulaleynasahin.jwt.JwtService;
import com.eylulaleynasahin.model.RefreshToken;
import com.eylulaleynasahin.model.User;
import com.eylulaleynasahin.repository.RefreshTokenRepository;
import com.eylulaleynasahin.repository.UserRepository;
import com.eylulaleynasahin.service.IAuthService;

@Service
public class AuthServiceImpl implements IAuthService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private AuthenticationProvider authenticationProvider;
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private RefreshTokenRepository refreshTokenRepository;
	
	private RefreshToken createRefreshToken(User user) {
		RefreshToken refreshToken = new RefreshToken();
		refreshToken.setRefreshToken(UUID.randomUUID().toString());
		refreshToken.setExpireDate(new Date(System.currentTimeMillis()+1000*60*60*4));
		refreshToken.setUser(user);
		return refreshToken;
	}
	
	@Override
	public AuthResponse authenticate(AuthRequest request) {
		try {
			UsernamePasswordAuthenticationToken auth = 
					new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword());
			authenticationProvider.authenticate(auth);
			
			Optional<User> optionalUser = userRepository.findByUsername(request.getUsername());
			String accessToken = jwtService.generateToken(optionalUser.get());
			
			RefreshToken refreshToken = createRefreshToken(optionalUser.get());
			refreshTokenRepository.save(refreshToken);
			
			return new AuthResponse(accessToken, refreshToken.getRefreshToken());
		} catch (Exception e) {
			System.out.println("Kullanıcı adı veya şifresi hatalı!");
		}
		return null;
	}
	
	@Override
	public DtoUser register(AuthRequest request) {
		User user = new User();
		DtoUser dtoUser = new DtoUser();
		
		user.setUsername(request.getUsername());
		user.setPassword(passwordEncoder.encode(request.getPassword()));
		
		User savedUser = userRepository.save(user);
		BeanUtils.copyProperties(savedUser, dtoUser);
		return dtoUser;
	}
}
