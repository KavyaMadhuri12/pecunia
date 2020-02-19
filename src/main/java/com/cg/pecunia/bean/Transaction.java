package com.cg.pecunia.bean;

public class Transaction {
private long ts_no;
private long acc_no;
private long date_name;
public Transaction(long ts_no, long acc_no, long date_name) {
	super();
	this.ts_no = ts_no;
	this.acc_no = acc_no;
	this.date_name = date_name;
}
public Transaction() {
	super();
}
public long getTs_no() {
	return ts_no;
}
public void setTs_no(long ts_no) {
	this.ts_no = ts_no;
}
public long getAcc_no() {
	return acc_no;
}
public void setAcc_no(long acc_no) {
	this.acc_no = acc_no;
}
public long getDate_name() {
	return date_name;
}
public void setDate_name(long date_name) {
	this.date_name = date_name;
}


}
