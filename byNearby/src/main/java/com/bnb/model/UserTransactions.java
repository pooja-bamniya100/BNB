package com.bnb.model;
// Generated 30 Jul, 2020 3:44:28 PM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserTransactions generated by hbm2java
 */
@Entity
@Table(name = "user_transactions", schema = "public")
public class UserTransactions implements java.io.Serializable {

	private long id;
	private Merchants merchants;
	private Users users;
	private Double amount;
	private Integer action;
	private String state;
	private String pnbTransactionId;
	private String notes;
	private String customerNotes;
	private Date createdAt;
	private Date updatedAt;
	private Set<FundTransfers> fundTransferses = new HashSet<FundTransfers>(0);

	public UserTransactions() {
	}

	public UserTransactions(long id, Date createdAt, Date updatedAt) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public UserTransactions(long id, Merchants merchants, Users users, Double amount, Integer action, String state,
			String pnbTransactionId, String notes, String customerNotes, Date createdAt, Date updatedAt,
			Set<FundTransfers> fundTransferses) {
		this.id = id;
		this.merchants = merchants;
		this.users = users;
		this.amount = amount;
		this.action = action;
		this.state = state;
		this.pnbTransactionId = pnbTransactionId;
		this.notes = notes;
		this.customerNotes = customerNotes;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.fundTransferses = fundTransferses;
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
	@JoinColumn(name = "merchant_id")
	public Merchants getMerchants() {
		return this.merchants;
	}

	public void setMerchants(Merchants merchants) {
		this.merchants = merchants;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "amount", precision = 17, scale = 17)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "action")
	public Integer getAction() {
		return this.action;
	}

	public void setAction(Integer action) {
		this.action = action;
	}

	@Column(name = "state")
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "pnb_transaction_id")
	public String getPnbTransactionId() {
		return this.pnbTransactionId;
	}

	public void setPnbTransactionId(String pnbTransactionId) {
		this.pnbTransactionId = pnbTransactionId;
	}

	@Column(name = "notes")
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "customer_notes")
	public String getCustomerNotes() {
		return this.customerNotes;
	}

	public void setCustomerNotes(String customerNotes) {
		this.customerNotes = customerNotes;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userTransactions")
	public Set<FundTransfers> getFundTransferses() {
		return this.fundTransferses;
	}

	public void setFundTransferses(Set<FundTransfers> fundTransferses) {
		this.fundTransferses = fundTransferses;
	}

}
