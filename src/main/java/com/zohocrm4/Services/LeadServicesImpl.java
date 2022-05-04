package com.zohocrm4.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm4.Repositories.LeadRepository;
import com.zohocrm4.entities.Lead;
@Service
public class LeadServicesImpl implements LeadServices {
@Autowired
private LeadRepository leadRepo;//here class downcasting is done
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}
	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
	@Override
	public Lead getById(int id) {
		Lead lead = leadRepo.getById(id);
		return lead;
	}
	@Override
	public void deleteLead(int id) {
		leadRepo.deleteById(id);
	}

}
