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
 * AepsTransactions generated by hbm2java
 */
@Entity
@Table(name = "aeps_transactions", schema = "public")
public class AepsTransactions implements java.io.Serializable {

	private long id;
	private String respCode;
	private String respMessage;
	private String terminalId;
	private String agentId;
	private Date dateTime;
	private String rrn;
	private String stan;
	private String requestId;
	private String txnId;
	private String uidaiAuthcode;
	private Double txnAmount;
	private Double accountBalance;
	private Double agentFee;
	private String accountNo;
	private String pnbTxnId;
	private Boolean isReversed;
	private String custMobile;
	private String agentMobile;
	private String serialNo;
	private String appId;
	private String errorType;
	private String errorDescription;
	private String bankName;
	private Integer retailerTransactionId;
	private Integer retailerId;
	private Date createdAt;
	private Date updatedAt;

	public AepsTransactions() {
	}

	public AepsTransactions(long id, Date createdAt, Date updatedAt) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public AepsTransactions(long id, String respCode, String respMessage, String terminalId, String agentId,
			Date dateTime, String rrn, String stan, String requestId, String txnId, String uidaiAuthcode,
			Double txnAmount, Double accountBalance, Double agentFee, String accountNo, String pnbTxnId,
			Boolean isReversed, String custMobile, String agentMobile, String serialNo, String appId, String errorType,
			String errorDescription, String bankName, Integer retailerTransactionId, Integer retailerId, Date createdAt,
			Date updatedAt) {
		this.id = id;
		this.respCode = respCode;
		this.respMessage = respMessage;
		this.terminalId = terminalId;
		this.agentId = agentId;
		this.dateTime = dateTime;
		this.rrn = rrn;
		this.stan = stan;
		this.requestId = requestId;
		this.txnId = txnId;
		this.uidaiAuthcode = uidaiAuthcode;
		this.txnAmount = txnAmount;
		this.accountBalance = accountBalance;
		this.agentFee = agentFee;
		this.accountNo = accountNo;
		this.pnbTxnId = pnbTxnId;
		this.isReversed = isReversed;
		this.custMobile = custMobile;
		this.agentMobile = agentMobile;
		this.serialNo = serialNo;
		this.appId = appId;
		this.errorType = errorType;
		this.errorDescription = errorDescription;
		this.bankName = bankName;
		this.retailerTransactionId = retailerTransactionId;
		this.retailerId = retailerId;
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

	@Column(name = "resp_code")
	public String getRespCode() {
		return this.respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	@Column(name = "resp_message")
	public String getRespMessage() {
		return this.respMessage;
	}

	public void setRespMessage(String respMessage) {
		this.respMessage = respMessage;
	}

	@Column(name = "terminal_id")
	public String getTerminalId() {
		return this.terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	@Column(name = "agent_id")
	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_time", length = 29)
	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	@Column(name = "rrn")
	public String getRrn() {
		return this.rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	@Column(name = "stan")
	public String getStan() {
		return this.stan;
	}

	public void setStan(String stan) {
		this.stan = stan;
	}

	@Column(name = "request_id")
	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Column(name = "txn_id")
	public String getTxnId() {
		return this.txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	@Column(name = "uidai_authcode")
	public String getUidaiAuthcode() {
		return this.uidaiAuthcode;
	}

	public void setUidaiAuthcode(String uidaiAuthcode) {
		this.uidaiAuthcode = uidaiAuthcode;
	}

	@Column(name = "txn_amount", precision = 17, scale = 17)
	public Double getTxnAmount() {
		return this.txnAmount;
	}

	public void setTxnAmount(Double txnAmount) {
		this.txnAmount = txnAmount;
	}

	@Column(name = "account_balance", precision = 17, scale = 17)
	public Double getAccountBalance() {
		return this.accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Column(name = "agent_fee", precision = 17, scale = 17)
	public Double getAgentFee() {
		return this.agentFee;
	}

	public void setAgentFee(Double agentFee) {
		this.agentFee = agentFee;
	}

	@Column(name = "account_no")
	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	@Column(name = "pnb_txn_id")
	public String getPnbTxnId() {
		return this.pnbTxnId;
	}

	public void setPnbTxnId(String pnbTxnId) {
		this.pnbTxnId = pnbTxnId;
	}

	@Column(name = "is_reversed")
	public Boolean getIsReversed() {
		return this.isReversed;
	}

	public void setIsReversed(Boolean isReversed) {
		this.isReversed = isReversed;
	}

	@Column(name = "cust_mobile")
	public String getCustMobile() {
		return this.custMobile;
	}

	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}

	@Column(name = "agent_mobile")
	public String getAgentMobile() {
		return this.agentMobile;
	}

	public void setAgentMobile(String agentMobile) {
		this.agentMobile = agentMobile;
	}

	@Column(name = "serial_no")
	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Column(name = "app_id")
	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	@Column(name = "error_type")
	public String getErrorType() {
		return this.errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	@Column(name = "error_description")
	public String getErrorDescription() {
		return this.errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	@Column(name = "bank_name")
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "retailer_transaction_id")
	public Integer getRetailerTransactionId() {
		return this.retailerTransactionId;
	}

	public void setRetailerTransactionId(Integer retailerTransactionId) {
		this.retailerTransactionId = retailerTransactionId;
	}

	@Column(name = "retailer_id")
	public Integer getRetailerId() {
		return this.retailerId;
	}

	public void setRetailerId(Integer retailerId) {
		this.retailerId = retailerId;
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
