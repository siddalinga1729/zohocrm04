package com.zohocrm4.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm4.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
//inheritance is done here
}
