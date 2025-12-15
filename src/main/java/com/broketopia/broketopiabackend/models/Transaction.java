package com.broketopia.broketopiabackend.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String accountName;

    @Column(nullable = false)
    private String iban;

    @Column(nullable = false)
    private Date bookingDate;

    @Column(nullable = false)
    private String recipientName;

    @Column(nullable = false)
    private String recipientIban;

    private String bic;

    private String recipientAccountNumber;

    private int bankCode;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private String currency;

    private String bookingDetails;

    private String bookingReference;

    private String note;

    @Column(nullable = false)
    private Date valuationDate;

    private String paidWith;

    private String paymentReference;

    private String creditorId;

    private String verificationOfPayee;

    private String ibanRegisteredTo;

    public Long getId() {
        return id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getIbanRegisteredTo() {
        return ibanRegisteredTo;
    }

    public void setIbanRegisteredTo(String ibanRegisteredTo) {
        this.ibanRegisteredTo = ibanRegisteredTo;
    }

    public String getVerificationOfPayee() {
        return verificationOfPayee;
    }

    public void setVerificationOfPayee(String verificationOfPayee) {
        this.verificationOfPayee = verificationOfPayee;
    }

    public String getCreditorId() {
        return creditorId;
    }

    public void setCreditorId(String creditorId) {
        this.creditorId = creditorId;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    public String getPaidWith() {
        return paidWith;
    }

    public void setPaidWith(String paidWith) {
        this.paidWith = paidWith;
    }

    public Date getValuationDate() {
        return valuationDate;
    }

    public void setValuationDate(Date valuationDate) {
        this.valuationDate = valuationDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getBookingDetails() {
        return bookingDetails;
    }

    public void setBookingDetails(String bookingDetails) {
        this.bookingDetails = bookingDetails;
    }

    public String getBookingReference() {
        return bookingReference;
    }

    public void setBookingReference(String bookingReference) {
        this.bookingReference = bookingReference;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getRecipientIban() {
        return recipientIban;
    }

    public void setRecipientIban(String recipientIban) {
        this.recipientIban = recipientIban;
    }

    public String getRecipientAccountNumber() {
        return recipientAccountNumber;
    }

    public void setRecipientAccountNumber(String recipientAccountNumber) {
        this.recipientAccountNumber = recipientAccountNumber;
    }
}
