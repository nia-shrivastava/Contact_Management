package neha.evolent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import neha.evolent.dao.ContactDao;
import neha.evolent.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	// Injection for Contact Dao
	@Autowired
	private ContactDao contactDao;

	@Transactional
	public List<Contact> getContacts() {
		return contactDao.getContacts();
	}

	@Transactional
	public void saveContact(Contact theContact) {
		contactDao.saveContact(theContact);
		
	}
	
	@Transactional
	public void deleteContact(int theId) {
		contactDao.deleteContact(theId);
	}

	@Transactional
	public Contact getContact(int theId) {
		return contactDao.getContact(theId);
	}
	
	
}





