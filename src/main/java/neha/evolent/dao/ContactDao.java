package neha.evolent.dao;

import java.util.List;

import neha.evolent.entity.Contact;

public abstract class ContactDao {	

		public abstract List<Contact> getContacts();

		public abstract void saveContact(Contact theContact);

		public abstract Contact getContact(int theId); 

		public abstract void deleteContact(int theId);
		
}	
	
