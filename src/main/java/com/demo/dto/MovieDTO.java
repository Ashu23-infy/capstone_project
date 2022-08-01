package com.demo.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class MovieDTO {
	private Integer movieId;
	private String movieTitle;
	private LocalDate movieReleased;
	private LocalTime movieRunningTime;
	public Integer getMovieId() {
		return movieId;
	}
	public MovieDTO(Integer movieId, String movieTitle, LocalDate movieReleased2, LocalTime movieRunningTime2) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.movieReleased = movieReleased2;
		this.movieRunningTime = movieRunningTime2;
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
	public void setMovieReleased(LocalDate movieReleased) {
		this.movieReleased = movieReleased;
	}
	public LocalTime getMovieRunningTime() {
		return movieRunningTime;
	}
	public void setMovieRunningTime(LocalTime movieRunningTime) {
		this.movieRunningTime = movieRunningTime;
	}

}
