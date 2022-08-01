package com.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	@Id
	private Integer movieId;
	private String movieTitle;
	private LocalDate movieReleased;
	private LocalTime movieRunningTime;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="movie_director", joinColumns= {@JoinColumn(name = "movieId")},
	 inverseJoinColumns = {@JoinColumn(name = "directorId")})
	
	Set<Director> director = new HashSet<>();
	public Movie() {
		
	}
	  public Movie(Integer movieId, String movieTitle, LocalDate movieReleased2, LocalTime movieRunningTime2) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.movieReleased = movieReleased2;
		this.movieRunningTime = movieRunningTime2;
	}
	
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public LocalDate getMovieReleased() {
		return movieReleased;
	}
	public void setMovieReleased(LocalDate localDate) {
		this.movieReleased = localDate;
	}
	public LocalTime getMovieRunningTime() {
		return movieRunningTime;
	}
	public void setMovieRunningTime(LocalTime localTime) {
		this.movieRunningTime = localTime;
	}
	
	public Set<Director> getDirector() {
		return director;
	}
	public void setDirector(Set<Director> director) {
		this.director = director;
	}
	@Override
	public int hashCode() {
		return Objects.hash(director, movieId, movieReleased, movieRunningTime, movieTitle);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(director, other.director) && Objects.equals(movieId, other.movieId)
				&& Objects.equals(movieReleased, other.movieReleased)
				&& Objects.equals(movieRunningTime, other.movieRunningTime)
				&& Objects.equals(movieTitle, other.movieTitle);
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + ", movieReleased=" + movieReleased
				+ ", movieRunningTime=" + movieRunningTime + "]";
	}
	
}
