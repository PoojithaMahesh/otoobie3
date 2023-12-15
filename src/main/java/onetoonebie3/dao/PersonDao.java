package onetoonebie3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebie3.dto.Person;

public class PersonDao {
public EntityManager getEntityManager() {
	return Persistence.createEntityManagerFactory("vinod").createEntityManager();
}


public void savePerson(Person person) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(person);
	entityTransaction.commit();
}


public void updatePerson(int id,Person person) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Person dbPerson=entityManager.find(Person.class, id);
	
	if(dbPerson!=null) {
		entityTransaction.begin();
		
		person.setId(id);
		person.setAadharCard(dbPerson.getAadharCard());
		
		entityManager.merge(person);
		entityTransaction.commit();
	}else {
		System.out.println("Sorry id is not present");
	}
	
	
	
	
	
	
}













}
