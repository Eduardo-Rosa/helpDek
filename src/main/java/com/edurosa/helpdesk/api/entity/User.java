package com.edurosa.helpdesk.api.entity;

import org.hibernate.validator.Email;
import org.hibernate.validator.NotNull;
import org.hibernate.validator.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.edurosa.helpdesk.api.enuns.ProfileEnum;

@Document
public class User {
	
	
	@Id
	private String id;
	
	
	@Indexed(unique = true)
	@NotNull(message = "Email required")
	@Email(message = "Email invalid")
	private String email;
	
	@NotNull(message = "Password reuired")
	@Size(min = 6)
	private String password;
	
	private ProfileEnum profile;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ProfileEnum getProfile() {
		return profile;
	}

	public void setProfile(ProfileEnum profile) {
		this.profile = profile;
	}
	
	
	
}
