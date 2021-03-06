package com.bnb.model;
// Generated 30 Jul, 2020 3:44:28 PM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Categories generated by hbm2java
 */
@Entity
@Table(name = "categories", schema = "public")
public class Categories implements java.io.Serializable {

	private long id;
	private String name;
	private Date createdAt;
	private Date updatedAt;
	private String image;
	private Set<SubCategories> subCategorieses = new HashSet<SubCategories>(0);
	private Set<Products> productses = new HashSet<Products>(0);

	public Categories() {
	}

	public Categories(long id, Date createdAt, Date updatedAt) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Categories(long id, String name, Date createdAt, Date updatedAt, String image,
			Set<SubCategories> subCategorieses, Set<Products> productses) {
		this.id = id;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.image = image;
		this.subCategorieses = subCategorieses;
		this.productses = productses;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 29)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", nullable = false, length = 29)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name = "image")
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public Set<SubCategories> getSubCategorieses() {
		return this.subCategorieses;
	}

	public void setSubCategorieses(Set<SubCategories> subCategorieses) {
		this.subCategorieses = subCategorieses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public Set<Products> getProductses() {
		return this.productses;
	}

	public void setProductses(Set<Products> productses) {
		this.productses = productses;
	}

}
