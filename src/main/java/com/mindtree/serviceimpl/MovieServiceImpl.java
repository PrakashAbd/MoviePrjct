package com.mindtree.serviceimpl;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mindtree.daoimpl.MovieDaoImpl;
import com.mindtree.entity.Movie;
import com.mindtree.service.MovieService;

public class MovieServiceImpl implements MovieService
{
	ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
	MovieDaoImpl movieDao = con.getBean("b",MovieDaoImpl.class);
	
	@Override
	public List<Movie> display() throws Exception 
	{
		try	{
			return movieDao.display();
		}
		catch(Exception e)
		{
			throw new Exception(e);
		}
	}

	@Override
	public Movie getByBxOfc() throws Exception 
	{
		try {
			return display().stream().max( (e1,e2) -> e1.getBoxOffice()>e2.getBoxOffice() ? 1 : -1).get();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public String addMovie(Movie movie) throws Exception 
	{
		try {
			return movieDao.addMovie(movie);
		}
		catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public String update(Movie movie) throws Exception 
	{
		try {
			return movieDao.update(movie);
		}
		catch(Exception e)
		{	throw new Exception(e);		}
	}

}
