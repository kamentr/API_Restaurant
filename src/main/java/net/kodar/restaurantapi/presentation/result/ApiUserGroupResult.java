package net.kodar.restaurantapi.presentation.result;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.NamedPersistent;

@Data
@EqualsAndHashCode(callSuper=true)
public class ApiUserGroupResult extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to ApiUser
	@ManyToOne
	@JoinColumn(name="user_id", nullable=false)
	private ApiUserResult apiUser;

	//bi-directional many-to-one association to ApiGroup
	@ManyToOne
	@JoinColumn(name="group_id", nullable=false)
	private ApiGroupResult apiGroup;
}