package org.swcraft.springframework.mvc.todos.model;

public class Todo {

	private final String text;
	private final boolean done;

	public Todo(final String text, final boolean done) {
		this.text = text;
		this.done = done;
	}

	public String getText() {
		return text;
	}

	public boolean isDone() {
		return done;
	}

}
