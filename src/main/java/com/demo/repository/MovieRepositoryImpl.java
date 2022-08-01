package com.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.demo.entity.Movie;

public class MovieRepositoryImpl {
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Movie> findByName(String name) {
		String queryString = "from Movie WHERE upper(movie_title) LIKE :name";
		return entityManager.createQuery(queryString, Movie.class)
				.setParameter("name", "%" + name.toUpperCase() + "%")
				.getResultList();
	}
	
	

}
