package com.example.movieportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie {
	
	@Id
	private Integer movieId;
	private String name;
	private String protagonist;
	private String director;
	private String language;

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProtagonist() {
		return protagonist;
	}

	public void setProtagonist(String protagonist) {
		this.protagonist = protagonist;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
