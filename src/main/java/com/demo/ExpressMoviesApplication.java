package com.demo;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entity.Director;
import com.demo.entity.Movie;
import com.demo.service.DirectorService;
import com.demo.service.MovieService;



@SpringBootApplication
public class ExpressMoviesApplication implements CommandLineRunner{
	@Autowired
	MovieService mservice;
	@Autowired
	DirectorService dservice;
	

	public static void main(String[] args) {
		SpringApplication.run(ExpressMoviesApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		
		Movie emovie = new Movie(1005,"ironman",LocalDate.of(1992, 1, 10), LocalTime.of(12, 02));
		Director director1 = new Director(2,"raja","kumar","pune",1234567890,"raja@gmail.com");
		emovie.getDirector().add(director1);
		director1.getMovie().add(emovie);
		mservice.insertMovie_Director(emovie);
		
		//-------to call list of movies-----------------
		mservice.getAllMovies();
		
		//-------to call list of directors-----------------
				dservice.getAllDirector();
		
		mservice.findMoviesByName("ironman");
		mservice.deleteMovieByName("kkkg");
		mservice.updateMovieReleaseByTitle(LocalDate.of(2000, 1, 10),"RRR");
		
		
		//-----------Director-------------------
		dservice.updatedirectorDetails("hyderbad", "kk", "kumar");
					

	}

}
