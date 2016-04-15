package kpicourier.com.service;

import kpicourier.com.model.Task;

public interface TaskService {
    void save(Task task);
    void update(Task task);
    void delete(Task task);
    Task findById(int id);
}
