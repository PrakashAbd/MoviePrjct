package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Actor;

public interface ActorDao 
{
	String add(Actor actor);
	List<Actor> displayActors();
}
