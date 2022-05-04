package com.zohocrm4.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm4.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Integer> {
//inheritance is done here
}
