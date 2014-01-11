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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "function",schema="suprblog")
public class Function implements java.io.Serializable {

	private Long id;
	private Function function;
	private String functionName;
	private String functionUrl;
	private Boolean isNode;
	private Long parentId;
	private Integer order;
	private Set<Function> functions = new HashSet<Function>(0);
	private Set<Auth> auths = new HashSet<Auth>(0);

	public Function() {
	}

	public Function(Function function, String functionName, Boolean isNode, Long parentId, Integer order) {
		this.function = function;
		this.functionName = functionName;
		this.isNode = isNode;
		this.parentId = parentId;
		this.order = order;
	}

	public Function(Function function, String functionName, String functionUrl, Boolean isNode, Long parentId, Integer order, Set<Function> functions,
			Set<Auth> auths) {
		this.function = function;
		this.functionName = functionName;
		this.functionUrl = functionUrl;
		this.isNode = isNode;
		this.parentId = parentId;
		this.order = order;
		this.functions = functions;
		this.auths = auths;
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
	@JoinColumn(name = "t_function_id", nullable = false)
	public Function getFunction() {
		return this.function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	@Column(name = "function_name", nullable = false, length = 25)
	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	@Column(name = "function_url", length = 100)
	public String getFunctionUrl() {
		return this.functionUrl;
	}

	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}

	@Column(name = "is_node", nullable = false)
	public Boolean getIsNode() {
		return this.isNode;
	}

	public void setIsNode(Boolean isNode) {
		this.isNode = isNode;
	}

	@Column(name = "parent_id", nullable = false)
	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	@Column(name = "order", nullable = false)
	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "function")
	public Set<Function> getFunctions() {
		return this.functions;
	}

	public void setFunctions(Set<Function> functions) {
		this.functions = functions;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "function")
	public Set<Auth> getAuths() {
		return this.auths;
	}

	public void setAuths(Set<Auth> auths) {
		this.auths = auths;
	}

}