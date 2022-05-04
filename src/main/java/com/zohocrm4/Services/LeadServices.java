package com.zohocrm4.Services;

import java.util.List;

import com.zohocrm4.entities.Lead;

public interface LeadServices {
public void saveLead(Lead lead);//here abstraction is done

public List<Lead> getAllLeads();

public Lead getById(int id);

public void deleteLead(int id);
}
