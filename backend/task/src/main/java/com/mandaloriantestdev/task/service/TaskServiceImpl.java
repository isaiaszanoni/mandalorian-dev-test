package com.mandaloriantestdev.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mandaloriantestdev.task.model.Task;
import com.mandaloriantestdev.task.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public boolean saveTask(Task task) {
		return taskRepository.saveTask(task);
	}
	
	@Override
	public List<Task> getAllTasks() {
		return taskRepository.getAllTasks();
	}

}
