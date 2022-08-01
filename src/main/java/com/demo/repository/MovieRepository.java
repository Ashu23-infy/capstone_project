package com.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Movie;


@Repository
public interface  MovieRepository extends JpaRepository<Movie,Integer> {
	List<Movie> findByName(String name);
	 @Transactional
	   @Modifying
	   @Query(value = "update  Movie set movie_released = ? " + " where movie_title = ?", nativeQuery = true)
    void updateMovieDate(LocalDate date,String name);
	 
	 @Transactional
	   @Modifying
	   @Query(value = "select  Movie.movie_title from movie join director", nativeQuery = true)
	 void movieList(String fname,String lname);

}
