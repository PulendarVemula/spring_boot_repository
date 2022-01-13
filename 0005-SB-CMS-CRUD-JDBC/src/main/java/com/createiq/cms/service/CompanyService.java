package com.createiq.cms.service;

import java.util.List;

import com.createiq.cms.model.Company;

public interface CompanyService {
	
public void add(Company company);
	
	public void update(Company company);
	
	public void deleteById(Integer cid);
	
	List<Company> findAll();
	
	Company findById(Integer cid);

}
