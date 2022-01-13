package com.createiq.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.cms.dao.CompanyDAO;
import com.createiq.cms.model.Company;

@Service("cmpService")
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	private CompanyDAO companyDAO;
	

	@Override
	public void add(Company company) {

		companyDAO.add(company);
	}

	@Override
	public void update(Company company) {

		companyDAO.update(company);
	}

	@Override
	public void deleteById(Integer cid) {

		companyDAO.deleteById(cid);
	}

	@Override
	public List<Company> findAll() {

		return companyDAO.findAll();
	}

	@Override
	public Company findById(Integer cid) {

		return companyDAO.findById(cid);
	}
	
	

}
