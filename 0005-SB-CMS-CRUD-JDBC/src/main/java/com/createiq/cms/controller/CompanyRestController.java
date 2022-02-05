package com.createiq.cms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.createiq.cms.model.Company;
import com.createiq.cms.service.CompanyService;

@RestController
@RequestMapping("/rs")
public class CompanyRestController {
	
	@Autowired
	private CompanyService companyService;

	@RequestMapping("/")
	public ModelAndView welcome() {
		return new ModelAndView("welcome");
		
	}
	
	@RequestMapping("/addCompany")
	public ModelAndView addCompany(Model model) {
		
		model.addAttribute("company", new Company());
		
		return new ModelAndView("addCompany");
		
	}
	
	@RequestMapping(value = "/saveCompany" , method = RequestMethod.POST)
	public ModelAndView saveCompany(@Valid Company company , BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			
			return new ModelAndView("addCompany");
		}
		companyService.add(company);
		
		return new ModelAndView("redirect:/allCompanies");
		
	}
	
	@RequestMapping("/allCompanies")
	public ModelAndView allCompanies() {
		
		List<Company>companies = companyService.findAll();
		
		return new ModelAndView("allCompanies" , "allCmp" , companies);
		
	}
	@RequestMapping("/deleteCompany")
	public ModelAndView deleteCompany(@RequestParam("cid") Integer cid) {
		
		companyService.deleteById(cid);
		
		return new ModelAndView("redirect:/allCompanies");
		
	}
	
	@RequestMapping("/showUpdateCompany")
	public ModelAndView showUpdateCompany(@RequestParam("cid") Integer cid) {
		 
		Company company =  companyService.findById(cid);
		
		return new ModelAndView("updateCompany", "company", company);
		
	}
	
	@RequestMapping("/updateCompany")
	public ModelAndView updateCompany(Company company) {
		
		companyService.update(company);
		
		return new ModelAndView("redirect:/allCompanies");
		
	}
	@RequestMapping(value = "/xml/allCmp" , produces = "application/xml")
	public List<Company> allCmpRS(){
		
		return companyService.findAll();
		
	}
	
	@RequestMapping(value = "/json/allCmp" , produces = "application/json")
	public List<Company> allCmpRSJson(){
		
		return companyService.findAll();
		
	}
}
