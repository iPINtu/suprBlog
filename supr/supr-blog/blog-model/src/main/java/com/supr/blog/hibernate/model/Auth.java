package com.supr.blog.hibernate.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "auth",schema="suprblog")
public class Auth implements java.io.Serializable {

	private Long id;
	private Function function;
	private String authName;
	private Boolean authType;
	private String authPath;
	private Set<Role> roles = new HashSet<Role>(0);

	public Auth() {
	}

	public Auth(Function function, String authName, Boolean authType, String authPath) {
		this.function = function;
		this.authName = authName;
		this.authType = authType;
		this.authPath = authPath;
	}

	public Auth(Function function, String authName, Boolean authType, String authPath, Set<Role> roles) {
		this.function = function;
		this.authName = authName;
		this.authType = authType;
		this.authPath = authPath;
		this.roles = roles;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "function_id", nullable = false)
	public Function getFunction() {
		return this.function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	@Column(name = "auth_name", nullable = false, length = 25)
	public String getAuthName() {
		return this.authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	@Column(name = "auth_type", nullable = false)
	public Boolean getAuthType() {
		return this.authType;
	}

	public void setAuthType(Boolean authType) {
		this.authType = authType;
	}

	@Column(name = "auth_path", nullable = false, length = 20)
	public String getAuthPath() {
		return this.authPath;
	}

	public void setAuthPath(String authPath) {
		this.authPath = authPath;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "auths")
	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}