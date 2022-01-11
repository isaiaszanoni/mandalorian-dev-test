package com.mandaloriantestdev.task.model;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.index.Indexed;


public class Task implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Indexed
	String id;
	
	
	//@Size(min = 10)
	@Pattern(regexp="[a-zA-Z]")
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
