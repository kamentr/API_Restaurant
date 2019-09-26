package net.kodar.restaurantapi.presentation.param;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.NamedPersistent;

import java.util.List;


/**
 * The persistent class for the api_group database table.
 * 
 */

@Data
@EqualsAndHashCode(callSuper=true)
public class ApiGroupParam extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to ApiGroupStatus
	@ManyToOne
	@JoinColumn(name="api_group_status_id", nullable=false)
	private ApiGroupStatusParam apiGroupStatus;

	//bi-directional many-to-one association to LifecycleStatus
	@ManyToOne
	@JoinColumn(name="status_id", nullable=false)
	private LifecycleStatusParam lifecycleStatus;
}