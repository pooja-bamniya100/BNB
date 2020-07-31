package com.bnb.model;
// Generated 30 Jul, 2020 3:44:28 PM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * References generated by hbm2java
 */
@Entity
@Table(name = "references", schema = "public")
public class References implements java.io.Serializable {

	private long id;
	private Integer referredId;
	private Integer referralId;
	private String referralType;
	private Date createdAt;
	private Date updatedAt;

	public References() {
	}

	public References(long id, Date createdAt, Date updatedAt) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public References(long id, Integer referredId, Integer referralId, String referralType, Date createdAt,
			Date updatedAt) {
		this.id = id;
		this.referredId = referredId;
		this.referralId = referralId;
		this.referralType = referralType;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "referred_id")
	public Integer getReferredId() {
		return this.referredId;
	}

	public void setReferredId(Integer referredId) {
		this.referredId = referredId;
	}

	@Column(name = "referral_id")
	public Integer getReferralId() {
		return this.referralId;
	}

	public void setReferralId(Integer referralId) {
		this.referralId = referralId;
	}

	@Column(name = "referral_type")
	public String getReferralType() {
		return this.referralType;
	}

	public void setReferralType(String referralType) {
		this.referralType = referralType;
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

}