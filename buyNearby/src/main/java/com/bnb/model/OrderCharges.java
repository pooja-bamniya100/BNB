package com.bnb.model;
// Generated 30 Jul, 2020 3:44:28 PM by Hibernate Tools 5.2.10.Final

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
 * OrderCharges generated by hbm2java
 */
@Entity
@Table(name = "order_charges", schema = "public")
public class OrderCharges implements java.io.Serializable {

	private long id;
	private Mdrs mdrs;
	private Orders orders;
	private ServiceTaxes serviceTaxes;
	private Double merchantMdr;
	private Double pgMdr;
	private Double merchantServiceTax;
	private Double pgServiceTax;
	private Double totalMerchantCharges;
	private Double totalPgCharges;
	private Double creditForMerchant;
	private Date createdAt;
	private Date updatedAt;

	public OrderCharges() {
	}

	public OrderCharges(long id, Date createdAt, Date updatedAt) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public OrderCharges(long id, Mdrs mdrs, Orders orders, ServiceTaxes serviceTaxes, Double merchantMdr, Double pgMdr,
			Double merchantServiceTax, Double pgServiceTax, Double totalMerchantCharges, Double totalPgCharges,
			Double creditForMerchant, Date createdAt, Date updatedAt) {
		this.id = id;
		this.mdrs = mdrs;
		this.orders = orders;
		this.serviceTaxes = serviceTaxes;
		this.merchantMdr = merchantMdr;
		this.pgMdr = pgMdr;
		this.merchantServiceTax = merchantServiceTax;
		this.pgServiceTax = pgServiceTax;
		this.totalMerchantCharges = totalMerchantCharges;
		this.totalPgCharges = totalPgCharges;
		this.creditForMerchant = creditForMerchant;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mdr_id")
	public Mdrs getMdrs() {
		return this.mdrs;
	}

	public void setMdrs(Mdrs mdrs) {
		this.mdrs = mdrs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_tax_id")
	public ServiceTaxes getServiceTaxes() {
		return this.serviceTaxes;
	}

	public void setServiceTaxes(ServiceTaxes serviceTaxes) {
		this.serviceTaxes = serviceTaxes;
	}

	@Column(name = "merchant_mdr", precision = 17, scale = 17)
	public Double getMerchantMdr() {
		return this.merchantMdr;
	}

	public void setMerchantMdr(Double merchantMdr) {
		this.merchantMdr = merchantMdr;
	}

	@Column(name = "pg_mdr", precision = 17, scale = 17)
	public Double getPgMdr() {
		return this.pgMdr;
	}

	public void setPgMdr(Double pgMdr) {
		this.pgMdr = pgMdr;
	}

	@Column(name = "merchant_service_tax", precision = 17, scale = 17)
	public Double getMerchantServiceTax() {
		return this.merchantServiceTax;
	}

	public void setMerchantServiceTax(Double merchantServiceTax) {
		this.merchantServiceTax = merchantServiceTax;
	}

	@Column(name = "pg_service_tax", precision = 17, scale = 17)
	public Double getPgServiceTax() {
		return this.pgServiceTax;
	}

	public void setPgServiceTax(Double pgServiceTax) {
		this.pgServiceTax = pgServiceTax;
	}

	@Column(name = "total_merchant_charges", precision = 17, scale = 17)
	public Double getTotalMerchantCharges() {
		return this.totalMerchantCharges;
	}

	public void setTotalMerchantCharges(Double totalMerchantCharges) {
		this.totalMerchantCharges = totalMerchantCharges;
	}

	@Column(name = "total_pg_charges", precision = 17, scale = 17)
	public Double getTotalPgCharges() {
		return this.totalPgCharges;
	}

	public void setTotalPgCharges(Double totalPgCharges) {
		this.totalPgCharges = totalPgCharges;
	}

	@Column(name = "credit_for_merchant", precision = 17, scale = 17)
	public Double getCreditForMerchant() {
		return this.creditForMerchant;
	}

	public void setCreditForMerchant(Double creditForMerchant) {
		this.creditForMerchant = creditForMerchant;
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
