package com.createiq.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.createiq.cms.model.Company;
import com.createiq.cms.service.CompanyService;

@Controller("cmpController")
public class CompanyController {

	@Autowired
	private CompanyService  companyService;
	
	
	@RequestMapping("/")
	public ModelAndView welcome() {
		
		return new ModelAndView("welcome");
	}
	
	@RequestMapping("/addCompany")
	public ModelAndView addCompany() {
		
		return new ModelAndView("addCompany");
	}
	
	@RequestMapping(value = "/saveCompany" , method = RequestMethod.POST)
	public ModelAndView saveCompany(Company company) {
		
		companyService.add(company);
		
		return new ModelAndView("redirect:/allCompanies");
		
	}
	
	@RequestMapping("/allCompanies")
	public ModelAndView allCompanies() {
		
		List<Company> companies = companyService.findAll(); 
		
		return new ModelAndView("allCompanies", "allCmp", companies);
		
	}
	
	@RequestMapping("/deleteCompany")
	public ModelAndView deleteCompany(@RequestParam("cid") Integer cid) {
		
		companyService.deleteById(cid);
		
		return new ModelAndView("redirect:/allCompanies");
	}
	
	@RequestMapping("/showUpdateCompany")
	public ModelAndView showUpdateCompany(@RequestParam("cid") Integer cid) {
		
		Company company = companyService.findById(cid);
		
		return new ModelAndView("updateCompany","company" , company);
		
	}
	
	@RequestMapping("/updateCompany")
	public ModelAndView updateCompany(Company company) {
		
		companyService.update(company);
		
		return new ModelAndView("redirect:/allCompanies");	
	}
}
