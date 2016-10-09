package org.swcraft.spring.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootReadinglistApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReadinglistApplication.class, args);
	}

	@Bean
	public CommandLineRunner setup(ReadingListRepository repository) {
		return new CommandLineRunner() {

			@Override
			public void run(String... arg0) throws Exception {
				System.out.println("Adding some books to the DB");
				repository.save(new Book("Harry Potter and the Order of the Phoenix", "Suzanne Collins ", 452323));
				repository.save(new Book("The Hunger Games", "J.K. Rowling", 123453));
			}
		};

	}

}
