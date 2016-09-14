package org.swcraft.springframework.core.configuration.auto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.swcraft.springframework.core.configuration.xml.Movie;

@Service
public class MovieListerService {

	private MovieRepositorty movieRepository;

	@Autowired
	public MovieListerService(MovieRepositorty movieRepository) {
		this.movieRepository = movieRepository;
	}

	public void listAll() {
		List<Movie> movies = movieRepository.findAll();
		movies.forEach(System.out::println);
	}

}
