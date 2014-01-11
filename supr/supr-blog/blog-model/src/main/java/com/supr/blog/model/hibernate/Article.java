package com.supr.blog.model.hibernate;

import java.sql.Timestamp;
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
@Table(name = "article",schema="suprblog")
public class Article implements java.io.Serializable {

	private Long id;
	private Admin admin;
	private Category category;
	private String title;
	private String content;
	private Long hits;
	private Boolean isPublic;
	private Boolean isTop;
	private String accessPassword;
	private Timestamp publishTime;
	private Timestamp modifyTime;
	private Set<Tag> tags = new HashSet<Tag>(0);

	// Constructors

	/** default constructor */
	public Article() {
	}

	/** minimal constructor */
	public Article(Admin admin, Category category, String title, String content, Long hits, Boolean isPublic, Boolean isTop, Timestamp publishTime,
			Timestamp modifyTime) {
		this.admin = admin;
		this.category = category;
		this.title = title;
		this.content = content;
		this.hits = hits;
		this.isPublic = isPublic;
		this.isTop = isTop;
		this.publishTime = publishTime;
		this.modifyTime = modifyTime;
	}

	/** full constructor */
	public Article(Admin admin, Category category, String title, String content, Long hits, Boolean isPublic, Boolean isTop, String accessPassword,
			Timestamp publishTime, Timestamp modifyTime, Set<Tag> tags) {
		this.admin = admin;
		this.category = category;
		this.title = title;
		this.content = content;
		this.hits = hits;
		this.isPublic = isPublic;
		this.isTop = isTop;
		this.accessPassword = accessPassword;
		this.publishTime = publishTime;
		this.modifyTime = modifyTime;
		this.tags = tags;
	}

	// Property accessors
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
	@JoinColumn(name = "admin_id", nullable = false)
	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name = "title", nullable = false, length = 50)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "content", nullable = false)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "hits", nullable = false)
	public Long getHits() {
		return this.hits;
	}

	public void setHits(Long hits) {
		this.hits = hits;
	}

	@Column(name = "is_public", nullable = false)
	public Boolean getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

	@Column(name = "is_top", nullable = false)
	public Boolean getIsTop() {
		return this.isTop;
	}

	public void setIsTop(Boolean isTop) {
		this.isTop = isTop;
	}

	@Column(name = "access_password", length = 50)
	public String getAccessPassword() {
		return this.accessPassword;
	}

	public void setAccessPassword(String accessPassword) {
		this.accessPassword = accessPassword;
	}

	@Column(name = "publish_time", nullable = false, length = 19)
	public Timestamp getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}

	@Column(name = "modify_time", nullable = false, length = 19)
	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "articles")
	public Set<Tag> getTags() {
		return this.tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

}