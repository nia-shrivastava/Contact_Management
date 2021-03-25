package neha.evolent.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neha.evolent.entity.Contact;
import neha.evolent.service.ContactService;

@RestController
@RequestMapping("/api")
public class ContactRestController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/contacts")
	public List<Contact> getContacts(){
		return contactService.getContacts();
	}
	
	@GetMapping("/contacts/{contactId}")
	public Contact getContact(@PathVariable int contactId) {
		
		Contact theContact = contactService.getContact(contactId);
		
		if(theContact == null) {
			throw new ContactNotFoundException("Contact Id not found - " + contactId);
		}
		
		return theContact;
	}

	//add mapping for Post /Contacts -- add new Contact
	
	@PostMapping("/contacts")
	public Contact addContact(@RequestBody Contact theContact) {

		contactService.saveContact(theContact);
		
		return theContact;
	}
	
	@PutMapping("/contacts")
	public Contact updateContact(@RequestBody Contact theContact) {
		contactService.saveContact(theContact);
		
		return theContact;
	}
	
	
	@DeleteMapping("/contacts/{contactId}")
	public String deleteContact(@PathVariable int contactId) {
		
		Contact tempContact = contactService.getContact(contactId);
		
		if(tempContact == null) {
			throw new ContactNotFoundException("Contact Id not found - " + contactId);
		}
		
		contactService.deleteContact(contactId);
		return "Deleted Contact id - " + contactId;
	}
	
}

