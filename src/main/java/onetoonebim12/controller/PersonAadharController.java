package onetoonebim12.controller;

import onetoonebim12.dao.AadharCardDao;
import onetoonebim12.dao.PersonDao;
import onetoonebim12.dto.AadharCard;
import onetoonebim12.dto.Person;

public class PersonAadharController {
public static void main(String[] args) {
	
//	Person person=new Person();
//	person.setId(1);
//	person.setName("lalitha");
//	person.setAddress("Mysore");
//	
//	PersonDao personDao=new PersonDao();
//	personDao.savePerson(person);
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setName("Lalitha malluri");
//	aadharCard.setAge(20);
//	AadharCardDao aadharCardDao=new AadharCardDao();
////	aadharCardDao.saveAadharCard(1, aadharCard);
//	aadharCardDao.updateAadharCard(101, aadharCard);
	
//	Person person=new Person();
//	person.setName("lalitha");
//	person.setAddress("bangalore");
//	PersonDao personDao=new PersonDao();
//	personDao.updatePerson(1, person);
	
//	PersonDao personDao=new PersonDao();
//	personDao.findPerson(1);
//	PersonDao personDao=new PersonDao();
//	personDao.deletePerson(1);
	AadharCardDao aadharCardDao=new AadharCardDao();
	aadharCardDao.deleteAadharCard(101);
}
}
