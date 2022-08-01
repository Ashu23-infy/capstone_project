package com.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.demo.entity.Director;

public class DirectorRepositoryImpl {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Director> findByName(String fname,String lname) {
		String queryString = "select director_id from Director WHERE upper(first_name) LIKE :first_name and upper(last_name) LIKE :last_name";
		return entityManager.createQuery(queryString, Director.class)
				.setParameter("first_name", "%" + fname.toUpperCase() + "%")
				.setParameter("last_name", "%" + lname.toUpperCase() + "%")
				.getResultList();
	}
	
}
