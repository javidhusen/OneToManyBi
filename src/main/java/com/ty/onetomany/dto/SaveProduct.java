package com.ty.onetomany.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveProduct {

	public static void main(String[] args) {

		EntityManagerFactory factor = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factor.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Brand brand = new Brand();
		brand.setName("SONY");

		Product product = new Product();
		product.setName("MOBILE");
		product.setCost(20000);
		product.setBrand(brand);

		Product product2 = new Product();
		product2.setName("TV");
		product2.setCost(40000);
		product2.setBrand(brand);

		Product product3 = new Product();
		product3.setName("EARPHONE");
		product3.setCost(2000);
		product3.setBrand(brand);

		List<Product> ls = new ArrayList<Product>();
		ls.add(product);
		ls.add(product2);
		ls.add(product3);

		brand.setProduct(ls);

		entityTransaction.begin();
		entityManager.persist(brand);
		entityManager.persist(product);
		entityManager.persist(product2);
		entityManager.persist(product3);
		entityTransaction.commit();
	}

}
