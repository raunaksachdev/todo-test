package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Todo;
import com.example.service.TodoService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class TodoController {
		
	@Autowired
	TodoService todoService;

	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public List<Todo> getTodoItems() {
		return todoService.getTodoItems();
	}
	
	@RequestMapping(value = "/todo", method = RequestMethod.POST)
	public Todo saveTodoItems(@RequestBody Todo todo) {
		return todoService.saveTodoItems(todo);
	}
	
	@RequestMapping(value = "/todo", method = RequestMethod.PUT)
	public Todo updateTodoItem(@RequestBody Todo todo) {
		todo.setStatus("C");
		return todoService.updateTodoItem(todo);
	}
	
	@RequestMapping(value = "/todo", method = RequestMethod.DELETE)
	public void deleteTodoItem(@RequestParam("id") String id) {
		 todoService.deleteTodoItem(id);
	}
	
}
