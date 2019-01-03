package com.mindtree.entity;

import java.util.List;

import javax.persistence.OneToMany;

public class Genre 
{
	String genreId;
	String genreName;
	@OneToMany
	List<Movie> genre_Id;
	public Genre() {
		super();
	}
	
	public Genre(String genreId, String genreName, List<Movie> moviesList) {
		super();
		this.genreId = genreId;
		this.genreName = genreName;
		this.genre_Id = moviesList;
	}
	
	public String getGenreId() {
		return genreId;
	}
	public void setGenreId(String genreId) {
		this.genreId = genreId;
	}
	public String getGenreName() {
		return genreName;
	}

	public List<Movie> getGenre_Id() {
		return genre_Id;
	}

	public void setGenre_Id(List<Movie> genre_Id) {
		this.genre_Id = genre_Id;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	@Override
	public String toString() {
		return "genreId=" + genreId + ", genreName=" + genreName;
	}
	
}
