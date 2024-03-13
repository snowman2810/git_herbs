package com.githerbs.auth.domain.auth.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.githerbs.auth.domain.auth.dto.common.MemberInfoDto;
import com.githerbs.auth.domain.auth.dto.request.AuthorizationTokenRequestDto;
import com.githerbs.auth.domain.auth.dto.request.JwtGrantTypeDto;
import com.githerbs.auth.domain.auth.dto.response.JwtExtrationResponseDto;
import com.githerbs.auth.domain.auth.dto.response.JwtResponseDto;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class JwtServiceImpl implements JwtService{

	@Value("${spring.jwt.secret}")
	private String secretKey;
	@Value("${spring.jwt.access-token-validity-in-seconds}")
	private long accessTokenValidTime;
	@Value("${spring.jwt.refresh-token-validity-in-seconds}")
	private long refreshTokenValidTime;

	@Override
	public JwtResponseDto createToken(JwtGrantTypeDto grantType, MemberInfoDto memberInfo,
		AuthorizationTokenRequestDto token, String state) {
		return null;
	}

	@Override
	public JwtExtrationResponseDto validateToken(AuthorizationTokenRequestDto token) {
		return null;
	}

	@Override
	public boolean revokeToken(AuthorizationTokenRequestDto token) {
		return false;
	}
}
