package com.eylulaleynasahin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eylulaleynasahin.model.RefreshToken;
import java.util.List;


@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken,Long>{

//	@Query(value = "from RefreshToken r where r.refreshToken = : refreshToken")
	Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
