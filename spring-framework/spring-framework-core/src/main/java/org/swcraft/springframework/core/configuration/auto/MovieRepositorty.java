package org.swcraft.springframework.core.configuration.auto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;
import org.swcraft.springframework.core.configuration.xml.Movie;

@Repository
public class MovieRepositorty {

	private List<Movie> movies = new ArrayList<>();

	public MovieRepositorty() {
		System.out.println("Calling constructor");
	}

	@PostConstruct
	public void init() {
		System.out.println("Initializing MovieRepositorty class");
		movies.addAll(
				Arrays.asList(new Movie("The Godfather"), new Movie("The Dark Knight "), new Movie("Pulp Fiction")));
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Closing MovieRepositorty class");
	}

	public List<Movie> findAll() {
		return movies;
	}
}
