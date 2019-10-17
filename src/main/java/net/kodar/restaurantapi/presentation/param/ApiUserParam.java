package net.kodar.restaurantapi.presentation.param;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.ApiUserStatus;
import net.kodar.restaurantapi.data.entities.NamedPersistent;


@Data
@EqualsAndHashCode(callSuper=true)
public class ApiUserParam extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false, length=100)
	private String password;
	
	@Column(nullable=false, length=100)
	private String username;

	//bi-directional many-to-one association to ApiUserStatus
	@ManyToOne
	@JoinColumn(name="api_user_status_id", nullable=false)
	private ApiUserStatus apiUserStatus;

	//bi-directional many-to-one association to LifecycleStatus
	@ManyToOne
	@JoinColumn(name="status_id", nullable=false)
	private LifecycleStatusParam lifecycleStatus;
}