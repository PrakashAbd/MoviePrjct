package com.mindtree.service;

import java.util.List;
import com.mindtree.entity.Genre;

public interface GenreService 
{
	String add(Genre actor) throws Exception;
	List<Genre> displayGenres() throws Exception;
}
