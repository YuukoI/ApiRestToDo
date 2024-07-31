package com.apirest.service;

import com.apirest.entity.Task;

import java.util.List;

public interface TaskService {

    public List<Task> getTasks();

    public Task getTask(Long id);

    public Task addTask(Task task);

    public Task updateTask(Task task);

    public void deleteTask(Long id);

}
