package com.mandaloriantestdev.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mandaloriantestdev.task.model.Task;
import com.mandaloriantestdev.task.service.TaskService;

@CrossOrigin("*")
@RestController
public class TaskController {

	@Autowired
	private TaskService service;
	

	@PostMapping("api/task/add")
	public ResponseEntity<String> saveTask(@RequestBody Task task) {
		
		int countInvalidChar = 0;
		
		for(int i = 0; i < task.getTaskName().length(); i++) {
			char ch = task.getTaskName().charAt(i);
			
			if(!Character.isLetter(ch) && ch != ' ') {
				countInvalidChar++;
			}
		}
		
		if(task.getTaskName().length() < 10 || countInvalidChar > 0) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		} else {
			boolean result = service.saveTask(task);
			if (result) {
				return ResponseEntity.ok("Task created successfully!");
			} else {
				// throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Task cannot be
				// created. Please, verify data entered", null);
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			} 
		}
	}

	@GetMapping("api/tasks")
	public ResponseEntity<List<Task>> getAllTasks() {
		List<Task> tasks;
		tasks = service.getAllTasks();
		return ResponseEntity.ok(tasks);
	}
}
