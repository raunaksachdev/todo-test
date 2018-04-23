package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Todo;
import com.example.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	TodoRepository todoRepository;
	
	public List<Todo> getTodoItems() {
		List<Todo> todos = todoRepository.findAll();
		return todos;
		
	}
	
	public Todo saveTodoItems(Todo todo) {
		return todoRepository.save(todo);
	}
	
	public Todo updateTodoItem(Todo todo) {
		return todoRepository.save(todo);
	}
	
	public void deleteTodoItem(String id) {
		todoRepository.deleteById(Integer.parseInt(id));
	
	}
}
