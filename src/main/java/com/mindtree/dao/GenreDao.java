package com.mindtree.dao;

import java.util.List;
import com.mindtree.entity.Genre;

public interface GenreDao 
{
	String add(Genre actor) throws Exception;
	List<Genre> displayGenres() throws Exception;
}
