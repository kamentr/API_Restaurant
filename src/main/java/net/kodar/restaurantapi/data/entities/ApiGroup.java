package net.kodar.restaurantapi.data.entities;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * The persistent class for the api_group database table.
 * 
 */

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="api_group")
@NamedQuery(name="ApiGroup.findAll", query="SELECT a FROM ApiGroup a")
public class ApiGroup extends NamedPersistent implements Serializable, GrantedAuthority {
	private static final long serialVersionUID = 1L;

	private String authority;

	//bi-directional many-to-one association to ApiGroupStatus
	@ManyToOne
	@JoinColumn(name="api_group_status_id")//, nullable=false)
	private ApiGroupStatus apiGroupStatus;

	//bi-directional many-to-one association to LifecycleStatus
	@ManyToOne
	@JoinColumn(name="status_id")//, nullable=false)
	private LifecycleStatus lifecycleStatus;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.authority;
	}

}