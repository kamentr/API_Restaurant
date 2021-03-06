package net.kodar.restaurantapi.presentation.result;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.ApiUserStatus;
import net.kodar.restaurantapi.data.entities.LifecycleStatus;
import net.kodar.restaurantapi.data.entities.NamedPersistent;


@Data
@EqualsAndHashCode(callSuper=true)
public class ApiUserResult extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, length=100)
	private String username;

	@ManyToOne
	@JoinColumn(name="api_user_status_id", nullable=false)
	private ApiUserStatus apiUserStatus;

	@ManyToOne
	@JoinColumn(name="status_id", nullable=false)
	private LifecycleStatus lifecycleStatus;
}