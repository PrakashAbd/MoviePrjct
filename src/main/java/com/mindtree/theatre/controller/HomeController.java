package com.mindtree.theatre.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.entity.Actor;
import com.mindtree.entity.Genre;
import com.mindtree.entity.Movie;
import com.mindtree.serviceimpl.ActorServiceImpl;
import com.mindtree.serviceimpl.GenreServiceImpl;
import com.mindtree.serviceimpl.MovieServiceImpl;


@Controller
public class HomeController {

	ActorServiceImpl actorService = new ActorServiceImpl();
	MovieServiceImpl movieService = new MovieServiceImpl();
	GenreServiceImpl genreService = new GenreServiceImpl();
	
	@RequestMapping(value="/")
	public ModelAndView test() throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/Movie")
	public ModelAndView test3(HttpServletResponse response) throws IOException{
		return new ModelAndView("Movie");
	}
	
	@RequestMapping(value="/add")
	public ModelAndView test11() throws IOException
	{
		return new ModelAndView("AddMovie");
		
	}
	@RequestMapping(value="/addMovie")
	public ModelAndView test5(@ModelAttribute("u") Movie movie, HttpServletRequest request) throws IOException
	{
		try {
			System.out.println(request.getParameter("actorId"));
			Genre genre = (Genre) genreService.displayGenres().stream().filter(e -> e.getGenreId() == request.getParameter("genreId"));
			movie.setGenre(genre);
			Actor actor = (Actor) actorService.displayActors().stream().filter(e -> e.getActorId() == request.getParameter("actorId"));
			movie.setActor(actor);
			movieService.addMovie(movie);
			
			return new ModelAndView("redirect:/displayMovie");
		} catch (Exception e) {
			System.out.println("Catch");
			return new ModelAndView("errorpage");
		}
	}
	
	@RequestMapping(value="/displayBoxOfc")
	public ModelAndView test10() throws IOException
	{
		List<Movie> list1 = new ArrayList<>();
		try {
			list1.add(movieService.getByBxOfc());
			return new ModelAndView ("displayMovie","list1",list1);
		} catch (Exception e) {
			return new ModelAndView("errorpage");
		}
		
		
	}
	
	@RequestMapping(value="/update")
	public ModelAndView test12() throws IOException
	{
		return new ModelAndView("updateValues");	
	}
	
	@RequestMapping(value="/updated")
	public ModelAndView test13(@ModelAttribute("a") Movie movie) throws Exception
	{
		try {
			movieService.update(movie);
			return new ModelAndView("redirect:/displayMovie");
		} catch (Exception e) {
			throw new Exception(e);
		}	
	}
	@RequestMapping(value="/displayMovie")
	public ModelAndView test7() throws IOException
	{
		try {
			List<Movie> list1 = movieService.display();
			return new ModelAndView("displayMovie","list1",list1);
		} catch (Exception e) {
			return new ModelAndView("errorpage");
		}	
	}
}
