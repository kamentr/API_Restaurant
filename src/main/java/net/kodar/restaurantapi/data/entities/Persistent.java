package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;

import lombok.Data;

@Data
@Access(AccessType.FIELD)
@MappedSuperclass
@OptimisticLocking(type = OptimisticLockType.VERSION)
public abstract class Persistent implements Serializable {

  private static final long serialVersionUID = -8700250893205702893L;

  @Id()
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  protected Long id;

  @NotNull
  @Column(name="locked", length = 1, columnDefinition = "TINYINT(1) NOT NULL DEFAULT '0'")
  protected boolean locked;

}
