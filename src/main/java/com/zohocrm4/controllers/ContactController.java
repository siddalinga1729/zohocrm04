package com.zohocrm4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm4.Services.ContactServices;
import com.zohocrm4.Services.LeadServices;
import com.zohocrm4.entities.Contact;
import com.zohocrm4.entities.Lead;

@Controller
public class ContactController {
@Autowired
private LeadServices leadServices;
	@Autowired
	private ContactServices contactServices;
	@RequestMapping("convert")
	public String convertLead(@RequestParam("id")int id,ModelMap model) {
		Lead lead = leadServices.getById(id);
		
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		contactServices.saveContact(contact);
		leadServices.deleteLead(id);
		List<Contact> contacts = contactServices.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "All_contacts";
	}
}
