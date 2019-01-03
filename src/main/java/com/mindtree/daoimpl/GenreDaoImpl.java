package com.mindtree.daoimpl;

import java.util.List;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.mindtree.dao.GenreDao;
import com.mindtree.entity.Genre;

public class GenreDaoImpl implements GenreDao
{
	HibernateTemplate genreTemplate;
	
	public GenreDaoImpl() {
		super();
	}

	public HibernateTemplate getGenreTemplate() {
		return genreTemplate;
	}

	public void setGenreTemplate(HibernateTemplate genreTemplate) {
		this.genreTemplate = genreTemplate;
	}

	public GenreDaoImpl(HibernateTemplate genreTemplate) {
		super();
		this.genreTemplate = genreTemplate;
	}
	
	@Override
	public String add(Genre actor) throws Exception 
	{
		Session session = genreTemplate.getSessionFactory().openSession();
		session.save(actor);
		session.beginTransaction().commit();
		
		return "Added Successfully";
	}

	@Override
	public List<Genre> displayGenres() throws Exception 
	{
		return genreTemplate.loadAll(Genre.class);
	}

}
