package com.zohocrm4.Services;

import java.util.List;

import com.zohocrm4.entities.Contact;

public interface ContactServices {
public void saveContact(Contact contact);//here abstraction is done

public List<Contact> getAllContacts();

public Contact getById(int id);
}
