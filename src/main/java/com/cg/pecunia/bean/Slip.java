package com.cg.pecunia.bean;

public class Slip {
private int id;
private double amount;
public Slip(int id, double amount) {
	super();
	this.id = id;
	this.amount = amount;
}
public Slip() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}

}
