package com.ty.onetomany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Mobile;

public class MobileDao {

	public Mobile getMobileById(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		
	Mobile mobile =	entityManager.find(Mobile.class, id);
	
	if(mobile != null) {
		mobile.getId();
		mobile.getName();
		mobile.getSim();
		
		return mobile;
	}
		return null;
		
	}
}
