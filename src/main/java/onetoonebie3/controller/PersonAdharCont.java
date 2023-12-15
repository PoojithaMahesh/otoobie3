package onetoonebie3.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebie3.dao.AadharCardDao;
import onetoonebie3.dao.PersonDao;
import onetoonebie3.dto.AadharCard;
import onetoonebie3.dto.Person;

public class PersonAdharCont {
public static void main(String[] args) {
//	Person person=new Person();
//	person.setId(2);
//	person.setName("Saisri");
//	person.setAddress("Chennai");
//	
//	PersonDao personDao=new PersonDao();
//	personDao.savePerson(person);
	
	AadharCard aadharCard=new AadharCard();
	aadharCard.setId(200);
	aadharCard.setName("Sai");
	aadharCard.setAge(18);
	
	AadharCardDao aadharCardDao=new AadharCardDao();
	aadharCardDao.saveAadharCard(2, aadharCard);
	
}
}
