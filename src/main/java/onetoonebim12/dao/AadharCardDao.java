package onetoonebim12.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebim12.dto.AadharCard;
import onetoonebim12.dto.Person;

public class AadharCardDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	
	public void saveAadharCard(int personId,AadharCard aadharCard) {
		EntityManager entityManager=getEntityManager();
		Person dbPerson=entityManager.find(Person.class, personId);
		if(dbPerson!=null) {
//			he is a valid person i can give him a aadharcard
			EntityTransaction  entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			aadharCard.setPerson(dbPerson);
			entityManager.persist(aadharCard);
//			update person details
			dbPerson.setAadharCard(aadharCard);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present");
		}
	}
	
	public void updateAadharCard(int id,AadharCard aadharCard) {
		EntityManager  entityManager=getEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			aadharCard.setId(id);
			aadharCard.setPerson(dbAadharCard.getPerson());
			entityManager.merge(aadharCard);
			entityTransaction.commit();
			
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
	
	public void findAadharCard(int id) {
		EntityManager  entityManager=getEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
			System.out.println(dbAadharCard);
			
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
	public void deleteAadharCard(int id) {
		EntityManager  entityManager=getEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbAadharCard);
			entityTransaction.commit();
			
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
