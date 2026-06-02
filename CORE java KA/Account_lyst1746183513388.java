package com.tka.entity;

public class Account {

	private int accntid;
	private String accnttyp;
	private double accntbal;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accntid, String accnttyp, double accntbal) {
		super();
		this.accntid = accntid;
		this.accnttyp = accnttyp;
		this.accntbal = accntbal;
	}
	public int getAccntid() {
		return accntid;
	}
	public void setAccntid(int accntid) {
		this.accntid = accntid;
	}
	public String getAccnttyp() {
		return accnttyp;
	}
	public void setAccnttyp(String accnttyp) {
		this.accnttyp = accnttyp;
	}
	public double getAccntbal() {
		return accntbal;
	}
	public void setAccntbal(double accntbal) {
		this.accntbal = accntbal;
	}
	@Override
	public String toString() {
		return "Account [accntid=" + accntid + ", accnttyp=" + accnttyp + ", accntbal=" + accntbal + "]";
	}
	
}
