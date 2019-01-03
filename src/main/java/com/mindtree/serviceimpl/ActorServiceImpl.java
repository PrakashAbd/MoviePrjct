package com.mindtree.serviceimpl;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mindtree.daoimpl.ActorDaoImpl;
import com.mindtree.entity.Actor;
import com.mindtree.service.ActorService;

public class ActorServiceImpl implements ActorService
{
	ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
	ActorDaoImpl  actorDao = con.getBean("a",ActorDaoImpl.class);
	
	@Override
	public String add(Actor actor) throws Exception 
	{
		try	{
			System.out.println(actor.getAge());
			if(actor.getAge()>14)
				return actorDao.add(actor);
			else
				throw new Exception("Invalid Age!!!!");
		} catch(Exception e)	{
			throw new Exception(e);
		}
	}

	@Override
	public List<Actor> displayActors() throws Exception 
	{
		try	{
			return actorDao.displayActors();
		} catch(Exception e) {
			throw new Exception(e);
		}
	}
		
}