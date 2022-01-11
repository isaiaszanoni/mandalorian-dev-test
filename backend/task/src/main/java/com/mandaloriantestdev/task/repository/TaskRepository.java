package com.mandaloriantestdev.task.repository;

import java.util.List;

import com.mandaloriantestdev.task.model.Task;

public interface TaskRepository {

	boolean saveTask(Task task);

	List<Task> getAllTasks();

}
