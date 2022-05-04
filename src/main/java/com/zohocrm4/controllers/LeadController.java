package com.zohocrm4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm4.Services.LeadServices;
import com.zohocrm4.entities.Lead;

@Controller
public class LeadController {
@Autowired
private LeadServices leadServices;
	@RequestMapping("/viewLeadPage")
	public String vieweLeadPage() {
		return "create_lead";
	}
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute() Lead lead,ModelMap model) {
		leadServices.saveLead(lead);
		model.addAttribute("lead", lead);
		return "view_lead";
	}
	@RequestMapping("listAllLead")
	public String getAllLeads(ModelMap model) {
		List<Lead> leads = leadServices.getAllLeads();
		model.addAttribute("leads", leads);
		return "listAll_Leads";
	}
	@RequestMapping("getById")
	public String getById(@RequestParam("id")int id,ModelMap model) {
		Lead lead=leadServices.getById(id);
		return "view_lead";
	}
}
