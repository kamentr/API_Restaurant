package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="api_user_group")
@NamedQuery(name="ApiUserGroup.findAll", query="SELECT a FROM ApiUserGroup a")
public class ApiUserGroup extends NamedPersistent implements Serializable {
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