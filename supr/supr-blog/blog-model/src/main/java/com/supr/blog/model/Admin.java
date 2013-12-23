package com.supr.blog.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "admin",uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class Admin implements java.io.Serializable {

	private Long id;
	private String username;
	private String password;
	private String nickname;
	private Boolean isEnable;
	private Boolean isLocked;
	private Timestamp lockedTime;
	private Timestamp loginTime;
	private String loginIp;
	private Timestamp createTime;
	private Timestamp modifyTime;
	private Set<Article> articles = new HashSet<Article>(0);
	private Set<Role> roles = new HashSet<Role>(0);

	public Admin() {
	}

	public Admin(String username, String password, String nickname, Boolean isEnable, Boolean isLocked, Timestamp createTime, Timestamp modifyTime) {
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.isEnable = isEnable;
		this.isLocked = isLocked;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
	}

	public Admin(String username, String password, String nickname, Boolean isEnable, Boolean isLocked, Timestamp lockedTime, Timestamp loginTime,
			String loginIp, Timestamp createTime, Timestamp modifyTime, Set<Article> articles, Set<Role> roles) {
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.isEnable = isEnable;
		this.isLocked = isLocked;
		this.lockedTime = lockedTime;
		this.loginTime = loginTime;
		this.loginIp = loginIp;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.articles = articles;
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

	@Column(name = "username", unique = true, nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "nickname", nullable = false, length = 30)
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name = "is_enable", nullable = false)
	public Boolean getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}

	@Column(name = "is_locked", nullable = false)
	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	@Column(name = "locked_time", length = 19)
	public Timestamp getLockedTime() {
		return this.lockedTime;
	}

	public void setLockedTime(Timestamp lockedTime) {
		this.lockedTime = lockedTime;
	}

	@Column(name = "login_time", length = 19)
	public Timestamp getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}

	@Column(name = "login_ip", length = 20)
	public String getLoginIp() {
		return this.loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	@Column(name = "create_time", nullable = false, length = 19)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Column(name = "modify_time", nullable = false, length = 19)
	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "admin")
	public Set<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "admins")
	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}