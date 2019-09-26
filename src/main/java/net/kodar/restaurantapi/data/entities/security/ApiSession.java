package net.kodar.restaurantapi.data.entities.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApiSession{

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

	private String username;
	
	@Column(name = "auth_token")
	private String authToken;

	public ApiSession() {

	}

	public ApiSession(String username, String authToken) {
		this.username = username;
		this.authToken = authToken;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	
	
}
