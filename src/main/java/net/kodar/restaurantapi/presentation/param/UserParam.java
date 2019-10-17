package net.kodar.restaurantapi.presentation.param;

import lombok.Data;

@Data
public class UserParam {

	private int id;

	private String password;
    
    private String username;
}
