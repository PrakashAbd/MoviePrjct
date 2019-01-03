package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Actor;

public interface ActorService 
{
	String add(Actor actor) throws Exception;
	List<Actor> displayActors() throws Exception;
}
