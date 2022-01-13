package com.createiq.cms.model;

public class Company {

	private Integer cid;
	private String cname;
	private String caddress;
	private Double ccapital;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(Integer cid, String cname, String caddress, Double ccapital) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
		this.ccapital = ccapital;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public Double getCcapital() {
		return ccapital;
	}

	public void setCcapital(Double ccapital) {
		this.ccapital = ccapital;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + ", ccapital=" + ccapital + "]";
	}
	
}
