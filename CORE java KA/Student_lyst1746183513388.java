package com.tka.entity;

public class Student {

	private int studid;
	private String studnm;
	private float studper;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studid, String studnm, float studper) {
		super();
		this.studid = studid;
		this.studnm = studnm;
		this.studper = studper;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudnm() {
		return studnm;
	}
	public void setStudnm(String studnm) {
		this.studnm = studnm;
	}
	public float getStudper() {
		return studper;
	}
	public void setStudper(float studper) {
		this.studper = studper;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studnm=" + studnm + ", studper=" + studper + "]";
	}
	
}
