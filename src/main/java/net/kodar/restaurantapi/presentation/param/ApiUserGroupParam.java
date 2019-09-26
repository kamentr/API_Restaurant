package net.kodar.restaurantapi.presentation.param;


import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.data.entities.NamedPersistent;

@Data
@EqualsAndHashCode(callSuper=true)
public class ApiUserGroupParam extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to ApiUser
	@ManyToOne
	@JoinColumn(name="user_id", nullable=false)
	private ApiUser apiUser;

	//bi-directional many-to-one association to ApiGroup
	@ManyToOne
	@JoinColumn(name="group_id", nullable=false)
	private ApiGroup apiGroup;
}