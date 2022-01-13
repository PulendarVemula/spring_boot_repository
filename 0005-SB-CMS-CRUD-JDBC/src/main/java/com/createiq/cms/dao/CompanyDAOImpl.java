package com.createiq.cms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.cms.model.Company;

@Repository("cmpDAO")
public class CompanyDAOImpl implements CompanyDAO{
	
	@Autowired
	private JdbcTemplate jDBCTemplate;
	

	@Override
	public void add(Company company) {

		jDBCTemplate.update("INSERT INTO COMPANY_01 VALUES (?,?,?,?)" , new Object[] {company.getCid() , company.getCname() , company.getCaddress() , company.getCcapital()});
	}

	@Override
	public void update(Company company) {

		jDBCTemplate.update("UPDATE COMPANY_01 SET CNAME = ? , CADDRESS = ? , CCAPITAL = ? WHERE CID = ?" , new Object[] {company.getCname() , company.getCaddress() , company.getCcapital() , company.getCid()} );
	}

	@Override
	public void deleteById(Integer cid) {

		jDBCTemplate.update("DELETE FROM COMPANY_01 WHERE CID = ?" , new Object[] {cid});
		
	}

	@Override
	public List<Company> findAll() {

		return jDBCTemplate.query("SELECT * FROM COMPANY_01", new BeanPropertyRowMapper(Company.class));
	}

	@Override
	public Company findById(Integer cid) {

		return (Company) jDBCTemplate.queryForObject("SELECT * FROM COMPANY_01 WHERE CID = ?", new Object[] {cid} , new BeanPropertyRowMapper(Company.class));
	}

}
