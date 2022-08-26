package com.hutech.dailyexpenseinfo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expense")
public class DailyExpense {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String expenseName;
	private String paidBy;
	private String paidTo;
	private String date;
	private String description;
	private String modeOfPayment;
	private double amount;
	private int quantity;
	private double total;
	private String status;

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpense_name(String expenseName) {
		this.expenseName = expenseName;
	}

	public String getPaidBy() {
		return paidBy;
	}

	public void setPaid_by(String paidBy) {
		this.paidBy = paidBy;
	}

	public String getPaidTo() {
		return paidTo;
	}

	public void setPaidTo(String paidTo) {
		this.paidTo = paidTo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public DailyExpense(String expenseName, String paidBy, String paidTo, String date, String description,
			String modeOfPayment, double amount, int quantity, double total, int id,String status) {

		this.expenseName = expenseName;
		this.paidBy = paidBy;
		this.paidTo = paidTo;
		this.date = date;
		this.description = description;
		this.modeOfPayment = modeOfPayment;
		this.amount = amount;
		this.quantity = quantity;
		this.total = total;
		this.id = id;
		this.status=status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DailyExpense() {
		super();

	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
