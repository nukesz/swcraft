package org.swcraft.springframework.core.configuration.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.swcraft.springframework.core.configuration.xml.MovieFinder;
import org.swcraft.springframework.core.configuration.xml.SimpleMovieLister;

@Configuration
public class MovieConfig {

	@Bean
	public SimpleMovieLister movieLister() {
		return new SimpleMovieLister(movieFinder());
	}

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public MovieFinder movieFinder() {
		return new MovieFinder();
	}
}
