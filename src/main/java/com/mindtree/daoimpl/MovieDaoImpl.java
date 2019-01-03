package com.mindtree.daoimpl;

import java.util.List;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;
import com.mindtree.dao.MovieDao;
import com.mindtree.entity.Movie;

public class MovieDaoImpl implements MovieDao
{
	HibernateTemplate movieTemplate;
	
	public MovieDaoImpl() {
		super();
	}

	public MovieDaoImpl(HibernateTemplate movieTemplate) {
		super();
		this.movieTemplate = movieTemplate;
	}

	public HibernateTemplate getMovieTemplate() {
		return movieTemplate;
	}

	public void setMovieTemplate(HibernateTemplate movieTemplate) {
		this.movieTemplate = movieTemplate;
	}

	@Override
	public List<Movie> display() 
	{
		return movieTemplate.loadAll(Movie.class);
	}

	@Override
	public String addMovie(Movie movie) 
	{
		Session session = movieTemplate.getSessionFactory().openSession();
		session.save(movie);
		session.beginTransaction().commit();
		
		return "Added Successfully";
	}

	@Override
	public String update(Movie movie) 
	{
		movieTemplate.bulkUpdate("update Movie set boxOffice = ? where movieId = ? ", movie.getBoxOffice(),movie.getMovieId());
		return "Updated Successfully";
	}

}
