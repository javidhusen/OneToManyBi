package com.ty.onetomany.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddProduct {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();

		Brand brand = entityManager.find(Brand.class, 1);

		if (brand != null) {
			Product produt4 = new Product();
			produt4.setName("Aqua");
			produt4.setCost(150000);
			produt4.setBrand(brand);
			
			Product produt5 = new Product();
			produt5.setName("watch");
			produt5.setCost(2000);
			produt5.setBrand(brand);

			entityTransaction.begin();
			entityManager.persist(produt4);
			entityManager.persist(produt5);
			entityTransaction.commit();
		}
	}

}
