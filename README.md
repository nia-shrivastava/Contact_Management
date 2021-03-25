# Contact_Management
# Project submission - Evolent Health
Project name : Contact-Mangement-Application

# Project Description
It is a Project Ready Contact Management Application which is implemented using Java 1.8, Spring REST, Maven, Apache Tomcat, Hibernate & Oracle database for storing contact information.

#Steps to run the application –
• Download the application code from github.
• Open the application on Eclipse.
• Create the table "contact" in oracle database, create table with below mentioned columns –
  Id, first_name,last_name,email,phone_number,status
• Send JSON requests from Postman to perform different CRUD operations. (Postman available as google chrome extension)
• Use below link to perform different operations with appropriate request type and JSON along with it.
To retrieve, create or update data related to contact information - http://localhost:8080/contact-management-application/api/contacts/
To retrieve single contact information or delete a contact information –http://localhost:8080/contact-management-application/api/contacts/{Contact-id}

As part of Spring REST, this application implements
• Request Mapping using annotations and usage of Controller,Repository,Service annotations
• Autowiring of required objects
• Usage of Dispatcher servlet.
• Followed interface design pattern.

As part of Hibernate ORM
• Usage of Entity , ID,Table annotations.
• Usage of Transactional annotations
