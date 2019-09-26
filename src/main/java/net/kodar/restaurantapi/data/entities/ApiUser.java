package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="api_user")
@NamedQuery(name="ApiUser.findAll", query="SELECT a FROM ApiUser a")
public class ApiUser extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false, length=100)
	private String password;

	@Column(nullable=false, length=100)
	private String username;

	//bi-directional many-to-one association to ApiUserStatus
	@ManyToOne
	@JoinColumn(name="api_user_status_id")//, nullable=false)
	private ApiUserStatus apiUserStatus;

	//bi-directional many-to-one association to LifecycleStatus
	@ManyToOne
	@JoinColumn(name="status_id")//, nullable=false)
	private LifecycleStatus lifecycleStatus;
}