package net.kodar.restaurantapi.data.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Access(AccessType.FIELD)
@MappedSuperclass
@OptimisticLocking(type = OptimisticLockType.VERSION)
public class NamedPersistent extends Persistent {

  private static final long serialVersionUID = 6857410091575760475L;
  
  @Column(length=50)
  private String code;

  @Column(nullable=false, length=100, columnDefinition="varchar(100) not null default ''")
  private String name;
  
  @Column(length=255)
  private String description;
}
