package com.mandaloriantestdev.task.service;

import java.util.List;

import com.mandaloriantestdev.task.model.Task;

public interface TaskService {

	boolean saveTask(Task task);

	List<Task> getAllTasks();

}
