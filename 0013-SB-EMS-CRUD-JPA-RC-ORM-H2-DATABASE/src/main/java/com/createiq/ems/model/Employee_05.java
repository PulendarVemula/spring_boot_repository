package com.createiq.ems.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(value = {
		@NamedQuery(name = "findNameById", query = "select e from Employee_05 e where e.eid=?1") 
})
@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "findSalById", query = "SELECT ESAL FROM EMPLOYEE_05 WHERE EID = ?") })
public class Employee_05 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid;
	private String ename;
	private Double esal;
	
	public Employee_05() {

	}

	public Employee_05(Integer eid, String ename, Double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getEsal() {
		return esal;
	}

	public void setEsal(Double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee_05 [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	

}
