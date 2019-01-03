package com.mindtree.entity;

import javax.persistence.ManyToOne;

public class Movie 
{
	String movieId;
	String movieName;
	String type;
	double boxOffice;
	@ManyToOne 
	Actor actor;
	
	@ManyToOne
	Genre genre;

	public Genre getGenre() {
		return genre;
	}

	public Movie(String movieId, String movieName, String type, double boxOffice, Actor actor, Genre genre) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.type = type;
		this.boxOffice = boxOffice;
		this.actor = actor;
		this.genre = genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actorList) {
		this.actor = actorList;
	}

	public Movie() {
		super();
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(double boxOffice) {
		this.boxOffice = boxOffice;
	}

	@Override
	public String toString() {
		return "movieId=" + movieId + ", movieName=" + movieName + ", "+ ", type=" + type + ", boxOffice=" + boxOffice;
	}
}
