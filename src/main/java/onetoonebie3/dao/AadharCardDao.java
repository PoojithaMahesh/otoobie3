package onetoonebie3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.border.EtchedBorder;

import onetoonebie3.dto.AadharCard;
import onetoonebie3.dto.Person;

public class AadharCardDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}

	public void saveAadharCard(int personId,AadharCard aadharCard) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person dbPerson=entityManager.find(Person.class, personId);
		if(dbPerson!=null) {
          entityTransaction.begin();
          aadharCard.setPerson(dbPerson);
          dbPerson.setAadharCard(aadharCard);
          
          entityManager.persist(aadharCard);
          entityTransaction.commit();
		}else {
			System.out.println("Sorry person id is not present");
		}
		
		
		
	}
	
	
	
	public void updateAadharCard(int id,AadharCard aadharCard) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
	
	if(dbAadharCard!=null) {
//		update
		entityTransaction.begin();
		
		aadharCard.setId(id);
		aadharCard.setPerson(dbAadharCard.getPerson());
		
		entityManager.merge(aadharCard);
		entityTransaction.commit();
	}else {
		System.out.println("sorry id is not present");
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
