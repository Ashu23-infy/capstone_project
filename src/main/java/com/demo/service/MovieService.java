package com.demo.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dto.MovieDTO;
import com.demo.entity.Movie;
import com.demo.repository.MovieRepository;

@Service
@Transactional
public class MovieService {
	@Autowired
	private MovieRepository repo;
	public void insertMovie(MovieDTO dto) {
		Movie entity = new Movie();
		entity.setMovieId(dto.getMovieId());
		entity.setMovieTitle(dto.getMovieTitle());
		entity.setMovieReleased(dto.getMovieReleased());
		entity.setMovieRunningTime(dto.getMovieRunningTime());
		repo.save(entity);
		
	}
	
	public void insertMovie_Director(Movie movie) {
		repo.save(movie);
	}
	
	public void getAllMovies() {
		List<Movie> list = repo.findAll();
		list.stream().forEach(System.out::println);
		}
	
	
	public void findMoviesByName(String name) throws Exception{
		List<Movie> list = repo.findByName(name);
		if(list.isEmpty()) {
			System.out.println("Invalid Movie title");
		}else {
			list.stream().forEach(System.out::println);
		}
	}
	
	public void deleteMovieByName(String name) throws Exception{
		List<Movie> list = repo.findByName(name);
		if(list.isEmpty()) {
			System.out.println("Movie with the given title is not present");
		}else {
			repo.deleteAll(list);
		}
	}
	
	public void updateMovieReleaseByTitle(LocalDate date , String name){
		repo.updateMovieDate(date,name);
		
	}
	
	
}
