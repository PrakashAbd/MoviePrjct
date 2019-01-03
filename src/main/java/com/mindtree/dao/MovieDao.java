package com.mindtree.dao;

import java.util.List;
import com.mindtree.entity.Movie;

public interface MovieDao 
{
	List<Movie> display();
	String addMovie(Movie movie);
	String update(Movie movie);
}
