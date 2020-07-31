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
 * Retailers generated by hbm2java
 */
@Entity
@Table(name = "retailers", schema = "public")
public class Retailers implements java.io.Serializable {

	private long id;
	private String name;
	private String img;
	private String authId;
	private String phoneNumber;
	private Date createdAt;
	private Date updatedAt;
	private Double avgRating;
	private Integer pnbRetailerId;
	private String referralCode;
	private String referralLink;
	private Set<RetailerNotifications> retailerNotificationses = new HashSet<RetailerNotifications>(0);
	private Set<Coupons> couponses = new HashSet<Coupons>(0);
	private Set<RetailerRatings> retailerRatingses = new HashSet<RetailerRatings>(0);
	private Set<UserRatings> userRatingses = new HashSet<UserRatings>(0);

	public Retailers() {
	}

	public Retailers(long id, Date createdAt, Date updatedAt) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Retailers(long id, String name, String img, String authId, String phoneNumber, Date createdAt,
			Date updatedAt, Double avgRating, Integer pnbRetailerId, String referralCode, String referralLink,
			Set<RetailerNotifications> retailerNotificationses, Set<Coupons> couponses,
			Set<RetailerRatings> retailerRatingses, Set<UserRatings> userRatingses) {
		this.id = id;
		this.name = name;
		this.img = img;
		this.authId = authId;
		this.phoneNumber = phoneNumber;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.avgRating = avgRating;
		this.pnbRetailerId = pnbRetailerId;
		this.referralCode = referralCode;
		this.referralLink = referralLink;
		this.retailerNotificationses = retailerNotificationses;
		this.couponses = couponses;
		this.retailerRatingses = retailerRatingses;
		this.userRatingses = userRatingses;
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

	@Column(name = "img")
	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Column(name = "auth_id")
	public String getAuthId() {
		return this.authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
	}

	@Column(name = "phone_number")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	@Column(name = "avg_rating", precision = 17, scale = 17)
	public Double getAvgRating() {
		return this.avgRating;
	}

	public void setAvgRating(Double avgRating) {
		this.avgRating = avgRating;
	}

	@Column(name = "pnb_retailer_id")
	public Integer getPnbRetailerId() {
		return this.pnbRetailerId;
	}

	public void setPnbRetailerId(Integer pnbRetailerId) {
		this.pnbRetailerId = pnbRetailerId;
	}

	@Column(name = "referral_code")
	public String getReferralCode() {
		return this.referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	@Column(name = "referral_link")
	public String getReferralLink() {
		return this.referralLink;
	}

	public void setReferralLink(String referralLink) {
		this.referralLink = referralLink;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "retailers")
	public Set<RetailerNotifications> getRetailerNotificationses() {
		return this.retailerNotificationses;
	}

	public void setRetailerNotificationses(Set<RetailerNotifications> retailerNotificationses) {
		this.retailerNotificationses = retailerNotificationses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "retailers")
	public Set<Coupons> getCouponses() {
		return this.couponses;
	}

	public void setCouponses(Set<Coupons> couponses) {
		this.couponses = couponses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "retailers")
	public Set<RetailerRatings> getRetailerRatingses() {
		return this.retailerRatingses;
	}

	public void setRetailerRatingses(Set<RetailerRatings> retailerRatingses) {
		this.retailerRatingses = retailerRatingses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "retailers")
	public Set<UserRatings> getUserRatingses() {
		return this.userRatingses;
	}

	public void setUserRatingses(Set<UserRatings> userRatingses) {
		this.userRatingses = userRatingses;
	}

}
