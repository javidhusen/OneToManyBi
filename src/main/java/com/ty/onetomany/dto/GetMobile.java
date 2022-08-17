package com.ty.onetomany.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetMobile {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Mobile mobile = entityManager.find(Mobile.class, 1);
		System.out.println("Mobile name is "+mobile.getName());
		System.out.println("Mobile id is "+mobile.getId());
		System.out.println("Mobile cost is "+mobile.getCost());
		
		//entityManager.find(Sim.class, 1);

	}

}
