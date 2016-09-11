package org.swcraft.springframework.mvc.todos.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.swcraft.springframework.mvc.todos.model.Todo;

@Repository
public class TodosManager {

	public Todo find(final int id) {
		return new Todo("Learn java", false);
	}

	public List<Todo> findAll() {
		return Arrays.asList(find(42));
	}

}
