package com.example.demo.dao.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.Fetch;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "user_details")
public class AuthUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cred_id")
	private int authUserId;
	@Column(name = "cred_username")
	private String authUsername;
	@Column(name = "cred_password")
	private String authPassword;


	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "credential_role", joinColumns = @JoinColumn(name = "cred_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	List<Roles> allRoles;

	public int getAuthUserId() {
		return authUserId;
	}

	public void setAuthUserId(int authUserId) {
		this.authUserId = authUserId;
	}

	public String getAuthUsername() {
		return authUsername;
	}

	public void setAuthUsername(String authUsername) {
		this.authUsername = authUsername;
	}

	public String getAuthPassword() {
		return authPassword;
	}

	public void setAuthPassword(String authPassword) {
		this.authPassword = authPassword;
	}

	public List<Roles> getAllRoles() {
		return allRoles;
	}

	public void setAllRoles(List<Roles> allRoles) {
		this.allRoles = allRoles;
	}
	
	
}
