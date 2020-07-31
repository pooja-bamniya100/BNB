package com.bnb.model;
// Generated 30 Jul, 2020 3:44:28 PM by Hibernate Tools 5.2.10.Final

import java.io.Serializable;
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
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users", schema = "public")
public class Users {

	private long id;
	private String name;
	private String phoneNumber;
	private String passwordDigest;
	private Double walletBalance;
	private Date createdAt;
	private Date updatedAt;
	private Double avgRating;
	private String authId;
	private String profileImage;
	private String email;
	private String pnbUserId;
	private Integer gender;
	private Serializable favouriteShops;
	private String pincode;
	private String latitude;
	private String longitude;
	private Boolean termsConditions;
	private Boolean whatsappSubscription;
	private Boolean registered;
	private String referralCode;
	private String referralLink;
	private Date dateOfBirth;
	private Boolean referralCodeUsed;
	private Set<FundTransfers> fundTransferses = new HashSet<FundTransfers>(0);
	private Set<UserCoupons> userCouponses = new HashSet<UserCoupons>(0);
	private Set<UserRatings> userRatingses = new HashSet<UserRatings>(0);
	private Set<UserNotifications> userNotificationses = new HashSet<UserNotifications>(0);
	private Set<RetailerRatings> retailerRatingses = new HashSet<RetailerRatings>(0);
	private Set<UserTransactions> userTransactionses = new HashSet<UserTransactions>(0);

	public Users() {
	}

	public Users(long id, String phoneNumber, Date createdAt, Date updatedAt) {
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Users(long id, String name, String phoneNumber, String passwordDigest, Double walletBalance, Date createdAt,
			Date updatedAt, Double avgRating, String authId, String profileImage, String email, String pnbUserId,
			Integer gender, Serializable favouriteShops, String pincode, String latitude, String longitude,
			Boolean termsConditions, Boolean whatsappSubscription, Boolean registered, String referralCode,
			String referralLink, Date dateOfBirth, Boolean referralCodeUsed, Set<FundTransfers> fundTransferses,
			Set<UserCoupons> userCouponses, Set<UserRatings> userRatingses, Set<UserNotifications> userNotificationses,
			Set<RetailerRatings> retailerRatingses, Set<UserTransactions> userTransactionses) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.passwordDigest = passwordDigest;
		this.walletBalance = walletBalance;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.avgRating = avgRating;
		this.authId = authId;
		this.profileImage = profileImage;
		this.email = email;
		this.pnbUserId = pnbUserId;
		this.gender = gender;
		this.favouriteShops = favouriteShops;
		this.pincode = pincode;
		this.latitude = latitude;
		this.longitude = longitude;
		this.termsConditions = termsConditions;
		this.whatsappSubscription = whatsappSubscription;
		this.registered = registered;
		this.referralCode = referralCode;
		this.referralLink = referralLink;
		this.dateOfBirth = dateOfBirth;
		this.referralCodeUsed = referralCodeUsed;
		this.fundTransferses = fundTransferses;
		this.userCouponses = userCouponses;
		this.userRatingses = userRatingses;
		this.userNotificationses = userNotificationses;
		this.retailerRatingses = retailerRatingses;
		this.userTransactionses = userTransactionses;
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

	@Column(name = "phone_number", nullable = false, length = 10)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "password_digest")
	public String getPasswordDigest() {
		return this.passwordDigest;
	}

	public void setPasswordDigest(String passwordDigest) {
		this.passwordDigest = passwordDigest;
	}

	@Column(name = "wallet_balance", precision = 17, scale = 17)
	public Double getWalletBalance() {
		return this.walletBalance;
	}

	public void setWalletBalance(Double walletBalance) {
		this.walletBalance = walletBalance;
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

	@Column(name = "auth_id")
	public String getAuthId() {
		return this.authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
	}

	@Column(name = "profile_image")
	public String getProfileImage() {
		return this.profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "pnb_user_id")
	public String getPnbUserId() {
		return this.pnbUserId;
	}

	public void setPnbUserId(String pnbUserId) {
		this.pnbUserId = pnbUserId;
	}

	@Column(name = "gender")
	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Column(name = "favourite_shops")
	public Serializable getFavouriteShops() {
		return this.favouriteShops;
	}

	public void setFavouriteShops(Serializable favouriteShops) {
		this.favouriteShops = favouriteShops;
	}

	@Column(name = "pincode", length = 6)
	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Column(name = "latitude")
	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude")
	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Column(name = "terms_conditions")
	public Boolean getTermsConditions() {
		return this.termsConditions;
	}

	public void setTermsConditions(Boolean termsConditions) {
		this.termsConditions = termsConditions;
	}

	@Column(name = "whatsapp_subscription")
	public Boolean getWhatsappSubscription() {
		return this.whatsappSubscription;
	}

	public void setWhatsappSubscription(Boolean whatsappSubscription) {
		this.whatsappSubscription = whatsappSubscription;
	}

	@Column(name = "registered")
	public Boolean getRegistered() {
		return this.registered;
	}

	public void setRegistered(Boolean registered) {
		this.registered = registered;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_birth", length = 13)
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Column(name = "referral_code_used")
	public Boolean getReferralCodeUsed() {
		return this.referralCodeUsed;
	}

	public void setReferralCodeUsed(Boolean referralCodeUsed) {
		this.referralCodeUsed = referralCodeUsed;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<FundTransfers> getFundTransferses() {
		return this.fundTransferses;
	}

	public void setFundTransferses(Set<FundTransfers> fundTransferses) {
		this.fundTransferses = fundTransferses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<UserCoupons> getUserCouponses() {
		return this.userCouponses;
	}

	public void setUserCouponses(Set<UserCoupons> userCouponses) {
		this.userCouponses = userCouponses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<UserRatings> getUserRatingses() {
		return this.userRatingses;
	}

	public void setUserRatingses(Set<UserRatings> userRatingses) {
		this.userRatingses = userRatingses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<UserNotifications> getUserNotificationses() {
		return this.userNotificationses;
	}

	public void setUserNotificationses(Set<UserNotifications> userNotificationses) {
		this.userNotificationses = userNotificationses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<RetailerRatings> getRetailerRatingses() {
		return this.retailerRatingses;
	}

	public void setRetailerRatingses(Set<RetailerRatings> retailerRatingses) {
		this.retailerRatingses = retailerRatingses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<UserTransactions> getUserTransactionses() {
		return this.userTransactionses;
	}

	public void setUserTransactionses(Set<UserTransactions> userTransactionses) {
		this.userTransactionses = userTransactionses;
	}

}