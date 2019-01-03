package com.mindtree.entity;

import java.util.List;
import javax.persistence.OneToMany;

public class Actor 
{
	String actorId;
	String actorName;
	int age;
	String gender;
	@OneToMany
	List<Movie> movieId;
	
	public List<Movie> getMovieId() {
		return movieId;
	}

	public void setMovieId(List<Movie> movieId) {
		this.movieId = movieId;
	}

	public Actor(String actorId, String actorName, int age, String gender, List<Movie> movieId) {
		super();
		this.actorId = actorId;
		this.actorName = actorName;
		this.age = age;
		this.gender = gender;
		this.movieId = movieId;
	}

	public Actor() {
		super();
	}

	public String getActorId() {
		return actorId;
	}

	public void setActorId(String actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "actorId=" + actorId + ", actorName=" + actorName + ", age=" + age + ", gender=" + gender;
	}
}
