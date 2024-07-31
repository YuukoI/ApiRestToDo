package com.apirest.service;

import com.apirest.entity.Task;
import com.apirest.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTask(Long id) {
        Task task = taskRepository.getById(id);
        if(task != null) {
            return task;
        }
        throw new IllegalArgumentException("La task con el id: " + id + ", no existe.");
    }

    @Override
    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        Task task = taskRepository.getById(id);
        if(task == null) {
            throw new IllegalArgumentException("La task con el id: " + id + ", no existe.");
        }
        taskRepository.deleteById(id);
    }
}
