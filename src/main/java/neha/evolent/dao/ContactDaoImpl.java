package neha.evolent.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import neha.evolent.entity.Contact;

@Repository
public class ContactDaoImpl extends ContactDao{

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	public List<Contact> getContacts() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
			
		// create a query  ... sort by last name
		Query<Contact> theQuery = 
				currentSession.createQuery("from Contact",
											Contact.class);
		
		// execute query and get result list
		List<Contact> contacts = theQuery.getResultList();
				
		// return the results		
		return contacts;
	}

	public void saveContact(Contact theContact) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the Contact ... finally LOL
		currentSession.saveOrUpdate(theContact);
		
	}

	public Contact getContact(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Contact theContact = currentSession.get(Contact.class, theId);
		
		return theContact;
	}

	public void deleteContact(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Contact where id=:contactId");
		theQuery.setParameter("contactId", theId);
		
		theQuery.executeUpdate();		
	}	
	
}
