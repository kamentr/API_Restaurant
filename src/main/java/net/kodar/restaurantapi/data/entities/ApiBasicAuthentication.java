package net.kodar.restaurantapi.data.entities;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ApiBasicAuthentication {

	private String username;

	private String password;

	// Basic dXNlcjp1c2Vy
	public ApiBasicAuthentication(String request) {
		if (null != request) {
			String base64Credentials = request.substring("Basic".length()).trim();
			byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
			String credentials = new String(credDecoded, StandardCharsets.UTF_8);
			final String[] values = credentials.split(":", 2);

			if (values != null) {
				this.setUsername(values[0]);
				this.setPassword(values[1]);
			}
		}
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
