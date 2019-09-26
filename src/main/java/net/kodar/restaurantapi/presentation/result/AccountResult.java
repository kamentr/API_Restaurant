package net.kodar.restaurantapi.presentation.result;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.data.entities.LifecycleStatus;
import net.kodar.restaurantapi.data.entities.NamedPersistent;


/**
 * The persistent class for the account database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class AccountResult extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to LifecycleStatus
	@ManyToOne
	@JoinColumn(name="status_id", nullable=false)
	private LifecycleStatus lifecycleStatus;

	//bi-directional many-to-one association to ApiUser
	@ManyToOne
	@JoinColumn(name="api_user_id", nullable=false)
	private ApiUser apiUser;
}