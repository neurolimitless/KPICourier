package kpicourier.com.service;

import kpicourier.com.dao.TaskDao;
import kpicourier.com.model.Task;

public class TaskServiceImpl implements TaskService {
    TaskDao taskDao;

    public void setTaskDao(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    public void save(Task task) {
        taskDao.save(task);
    }

    public void delete(Task task) {
        taskDao.delete(task);
    }

    public void update(Task task) {
        taskDao.update(task);
    }

    public Task findById(int id) {
        return taskDao.findById(id);
    }
}
