package com.supr.blog.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role implements java.io.Serializable {

	private Long id;
	private String roleName;
	private String description;
	private Boolean isSystem;
	private Set<Auth> auths = new HashSet<Auth>(0);
	private Set<Admin> admins = new HashSet<Admin>(0);

	public Role() {
	}

	public Role(String roleName, Boolean isSystem) {
		this.roleName = roleName;
		this.isSystem = isSystem;
	}

	public Role(String roleName, String description, Boolean isSystem, Set<Auth> auths, Set<Admin> admins) {
		this.roleName = roleName;
		this.description = description;
		this.isSystem = isSystem;
		this.auths = auths;
		this.admins = admins;
	}

	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "role_name", nullable = false, length = 25)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Column(name = "description", length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "is_system", nullable = false)
	public Boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(Boolean isSystem) {
		this.isSystem = isSystem;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "role_auth", joinColumns = { @JoinColumn(name = "t_role_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "t_auth_id", nullable = false, updatable = false) })
	public Set<Auth> getAuths() {
		return this.auths;
	}

	public void setAuths(Set<Auth> auths) {
		this.auths = auths;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "admin_role", joinColumns = { @JoinColumn(name = "t_role_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "t_admin_id", nullable = false, updatable = false) })
	public Set<Admin> getAdmins() {
		return this.admins;
	}

	public void setAdmins(Set<Admin> admins) {
		this.admins = admins;
	}

}