package org.swcraft.spring.boot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String author;
	private Integer isbn;

	public Book() { // :( Jpa
	}

	public Book(String title, String author, Integer isbn) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Integer getIsbn() {
		return isbn;
	}

}
