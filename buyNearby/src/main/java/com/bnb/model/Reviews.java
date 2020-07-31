package com.bnb.model;
// Generated 30 Jul, 2020 3:44:28 PM by Hibernate Tools 5.2.10.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Reviews generated by hbm2java
 */
@Entity
@Table(name = "reviews", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = { "order_id",
		"user_id" }))
public class Reviews implements java.io.Serializable {

	private long id;
	private Long userId;
	private Double rating;
	private String comments;
	private Serializable reviewFields;
	private Integer reviewType;
	private Long orderId;
	private Long shopId;
	private Date createdAt;
	private Date updatedAt;
	private String platform;

	public Reviews() {
	}

	public Reviews(long id, Date createdAt, Date updatedAt) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Reviews(long id, Long userId, Double rating, String comments, Serializable reviewFields, Integer reviewType,
			Long orderId, Long shopId, Date createdAt, Date updatedAt, String platform) {
		this.id = id;
		this.userId = userId;
		this.rating = rating;
		this.comments = comments;
		this.reviewFields = reviewFields;
		this.reviewType = reviewType;
		this.orderId = orderId;
		this.shopId = shopId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.platform = platform;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "user_id")
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "rating", precision = 17, scale = 17)
	public Double getRating() {
		return this.rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	@Column(name = "comments")
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Column(name = "review_fields")
	public Serializable getReviewFields() {
		return this.reviewFields;
	}

	public void setReviewFields(Serializable reviewFields) {
		this.reviewFields = reviewFields;
	}

	@Column(name = "review_type")
	public Integer getReviewType() {
		return this.reviewType;
	}

	public void setReviewType(Integer reviewType) {
		this.reviewType = reviewType;
	}

	@Column(name = "order_id")
	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Column(name = "shop_id")
	public Long getShopId() {
		return this.shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
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

	@Column(name = "platform")
	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

}
