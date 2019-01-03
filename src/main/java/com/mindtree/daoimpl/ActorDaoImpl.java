package com.mindtree.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;
import com.mindtree.dao.ActorDao;
import com.mindtree.entity.Actor;

public class ActorDaoImpl implements ActorDao 
{
	HibernateTemplate template;
	
	public ActorDaoImpl() {
		super();
	}

	public ActorDaoImpl(HibernateTemplate template) {
		super();
		this.template = template;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public String add(Actor actor) 
	{
		Session session = template.getSessionFactory().openSession();
		session.save(actor);
		session.beginTransaction().commit();
		System.out.println("Inside Dao");
		
		return "Added Successfully";
	}

	@Override
	public List<Actor> displayActors() 
	{
		return template.loadAll(Actor.class);
	}
	
}
