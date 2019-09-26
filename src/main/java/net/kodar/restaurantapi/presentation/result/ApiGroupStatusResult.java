package net.kodar.restaurantapi.presentation.result;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.NamedPersistent;

import java.util.List;


/**
 * The persistent class for the api_group_status database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class ApiGroupStatusResult extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to ApiGroup
	@OneToMany(mappedBy="apiGroupStatus")
	private List<ApiGroupResult> apiGroups;

}