package com.mandaloriantestdev.task.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.mandaloriantestdev.task.model.Task;

@Repository
public class TaskRepositoryImpl implements TaskRepository{

	@Autowired
	private RedisTemplate redisTemplate;
	
	private static final String KEY = "TASK";
	
	@Override
	public boolean saveTask (Task task) {
		try {
			redisTemplate.opsForHash().put(KEY, task.getId().toString(), task);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
}
