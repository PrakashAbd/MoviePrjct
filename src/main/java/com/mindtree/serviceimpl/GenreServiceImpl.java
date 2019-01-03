package com.mindtree.serviceimpl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.daoimpl.GenreDaoImpl;
import com.mindtree.entity.Genre;
import com.mindtree.service.GenreService;

public class GenreServiceImpl implements GenreService
{
	ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
	GenreDaoImpl genreDao = con.getBean("c",GenreDaoImpl.class);
	@Override
	public String add(Genre actor) throws Exception 
	{
		try	{
				return genreDao.add(actor);
		} catch(Exception e)	{
			throw new Exception(e);
		}
	}

	@Override
	public List<Genre> displayGenres() throws Exception {
		try	{
			return genreDao.displayGenres();
		} catch(Exception e) {
			throw new Exception(e);
		}
	}
	

}
