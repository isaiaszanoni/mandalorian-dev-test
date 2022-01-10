package com.mandaloriantestdev.task.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.index.Indexed;



public class Task {
	
	@Id
	@Indexed
	String id;
	
	@NotBlank
	@Size(min = 10)
	@Pattern(regexp="^[A-Za-z]*$", message = "Invalid Input")
	private String taskName;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	

}
