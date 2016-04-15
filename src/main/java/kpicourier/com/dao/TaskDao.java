package kpicourier.com.dao;

import kpicourier.com.model.Task;

public interface TaskDao {
    void save(Task task);
    void delete(Task task);
    void update(Task task);
    Task findById(int id);

}
