package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.dao.entity.AuthUser;
import com.example.demo.repo.AuthUserRepoitory;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	AuthUserRepoitory authUserRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<AuthUser> authUser=authUserRepo.findByAuthUsername(username);
		return authUser
				.map((user)->new CustomUserDetails(user.getAuthUsername(), user.getAuthPassword(), user.getAllRoles()))
				.orElseThrow(()-> new UsernameNotFoundException(username + " not found"));
				
	}

}
