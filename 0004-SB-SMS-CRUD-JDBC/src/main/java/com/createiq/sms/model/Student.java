package com.createiq.sms.model;

public class Student {

	
	private Integer sid;
	private String sname;
	private String saddress;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer sid, String sname, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
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

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "]";
	}
	
}
