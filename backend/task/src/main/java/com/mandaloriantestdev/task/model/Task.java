package com.mandaloriantestdev.task.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Task {
	
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
	

}
