package com.bnb.model;
// Generated 30 Jul, 2020 3:44:28 PM by Hibernate Tools 5.2.10.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OrderSpecs generated by hbm2java
 */
@Entity
@Table(name = "order_specs", schema = "public")
public class OrderSpecs implements java.io.Serializable {

	private long id;
	private Orders orders;
	private Boolean deliveryChargeApplicable;
	private Double deliveryCharge;
	private Double minOrderVal;
	private Double freeDeliveryMinOrderVal;
	private BigDecimal discountRate;
	private Double discountMinOrderVal;
	private Date createdAt;
	private Date updatedAt;
	private Boolean discountApplicability;

	public OrderSpecs() {
	}

	public OrderSpecs(long id, Date createdAt, Date updatedAt) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public OrderSpecs(long id, Orders orders, Boolean deliveryChargeApplicable, Double deliveryCharge,
			Double minOrderVal, Double freeDeliveryMinOrderVal, BigDecimal discountRate, Double discountMinOrderVal,
			Date createdAt, Date updatedAt, Boolean discountApplicability) {
		this.id = id;
		this.orders = orders;
		this.deliveryChargeApplicable = deliveryChargeApplicable;
		this.deliveryCharge = deliveryCharge;
		this.minOrderVal = minOrderVal;
		this.freeDeliveryMinOrderVal = freeDeliveryMinOrderVal;
		this.discountRate = discountRate;
		this.discountMinOrderVal = discountMinOrderVal;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.discountApplicability = discountApplicability;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@Column(name = "delivery_charge_applicable")
	public Boolean getDeliveryChargeApplicable() {
		return this.deliveryChargeApplicable;
	}

	public void setDeliveryChargeApplicable(Boolean deliveryChargeApplicable) {
		this.deliveryChargeApplicable = deliveryChargeApplicable;
	}

	@Column(name = "delivery_charge", precision = 17, scale = 17)
	public Double getDeliveryCharge() {
		return this.deliveryCharge;
	}

	public void setDeliveryCharge(Double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	@Column(name = "min_order_val", precision = 17, scale = 17)
	public Double getMinOrderVal() {
		return this.minOrderVal;
	}

	public void setMinOrderVal(Double minOrderVal) {
		this.minOrderVal = minOrderVal;
	}

	@Column(name = "free_delivery_min_order_val", precision = 17, scale = 17)
	public Double getFreeDeliveryMinOrderVal() {
		return this.freeDeliveryMinOrderVal;
	}

	public void setFreeDeliveryMinOrderVal(Double freeDeliveryMinOrderVal) {
		this.freeDeliveryMinOrderVal = freeDeliveryMinOrderVal;
	}

	@Column(name = "discount_rate", precision = 131089, scale = 0)
	public BigDecimal getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(BigDecimal discountRate) {
		this.discountRate = discountRate;
	}

	@Column(name = "discount_min_order_val", precision = 17, scale = 17)
	public Double getDiscountMinOrderVal() {
		return this.discountMinOrderVal;
	}

	public void setDiscountMinOrderVal(Double discountMinOrderVal) {
		this.discountMinOrderVal = discountMinOrderVal;
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

	@Column(name = "discount_applicability")
	public Boolean getDiscountApplicability() {
		return this.discountApplicability;
	}

	public void setDiscountApplicability(Boolean discountApplicability) {
		this.discountApplicability = discountApplicability;
	}

}
