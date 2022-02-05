package com.createiq.ems.model;

public class ResponseBean {
	
	private Integer statusCode;
	private Object result;
	
	public ResponseBean() {
		// TODO Auto-generated constructor stub
	}

	public ResponseBean(Integer statusCode, Object result) {
		super();
		this.statusCode = statusCode;
		this.result = result;
	}

	@Override
	public String toString() {
		return "ResponseBean [statusCode=" + statusCode + ", result=" + result + "]";
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
	

}
