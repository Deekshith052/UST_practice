package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.entity.AuthUser;

@Repository
public interface AuthUserRepoitory extends JpaRepository<AuthUser, Integer> {
	Optional<AuthUser> findByAuthUsername(String authUsername);
}
