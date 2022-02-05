package com.createiq.sms.model;

public class Student {

	private Integer sid;
	private String sname;
	private Double sfee;
	private String saddress;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", saddress=" + saddress + "]";
	}

	public Student(Integer sid, String sname, Double sfee, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.saddress = saddress;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Double getSfee() {
		return sfee;
	}

	public void setSfee(Double sfee) {
		this.sfee = sfee;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	
	
}
