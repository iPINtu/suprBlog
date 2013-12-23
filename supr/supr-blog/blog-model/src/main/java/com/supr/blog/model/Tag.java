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
@Table(name = "tag",schema="suprblog")
public class Tag implements java.io.Serializable {

	private Long id;
	private String tagName;
	private Set<Article> articles = new HashSet<Article>(0);

	public Tag() {
	}

	public Tag(String tagName) {
		this.tagName = tagName;
	}

	public Tag(String tagName, Set<Article> articles) {
		this.tagName = tagName;
		this.articles = articles;
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

	@Column(name = "tag_name", nullable = false, length = 20)
	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "article_tag", joinColumns = { @JoinColumn(name = "t_tag_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "t_article_id", nullable = false, updatable = false) })
	public Set<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

}