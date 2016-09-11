package org.swcraft.springframework.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.swcraft.springframework.mvc.todos.controller.TodosManager;
import org.swcraft.springframework.mvc.todos.model.Todo;

@RestController
public class TodosController {

	@Autowired
	private TodosManager manager;

	@RequestMapping("/todos")
	public List<Todo> findAll() {
		return manager.findAll();
	}

	@RequestMapping("/todos/{id}")
	public Todo find(@PathVariable final int id) {
		return manager.find(id);
	}

}