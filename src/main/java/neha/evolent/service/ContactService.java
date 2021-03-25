package neha.evolent.service;

import java.util.List;

import neha.evolent.entity.Contact;

//Interface Declaration for Contact Service

public interface ContactService {

	// Interface methods
	public List<Contact> getContacts();

	public void saveContact(Contact theContact);

	public void deleteContact(int theId);
	
	public Contact getContact(int theId);
	
}
