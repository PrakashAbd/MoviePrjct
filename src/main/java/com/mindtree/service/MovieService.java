package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Movie;

public interface MovieService 
{
	String addMovie(Movie movie) throws Exception;
	List<Movie> display() throws Exception;
	Movie getByBxOfc() throws Exception;
	String update(Movie movie) throws Exception;
}
