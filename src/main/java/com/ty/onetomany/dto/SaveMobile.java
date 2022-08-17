package com.ty.onetomany.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobile {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Mobile mobile = new Mobile();
		mobile.setName("OnePlus");
		mobile.setCost(29000);
		
		Sim sim1 = new Sim();
		sim1.setImrc("air52412");
		sim1.setProvider("AirTel");
		sim1.setMobile(mobile);
		
		Sim sim2 = new Sim();
		sim2.setImrc("Bs2412");
		sim2.setProvider("BSNL");
		sim2.setMobile(mobile);
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();
				
	}

}
