package kpicourier.com.dao;

import kpicourier.com.model.Task;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("taskDao")
public class TaskDaoImpl extends HibernateDaoSupport implements TaskDao {


    public void save(Task task) {
        getHibernateTemplate().setCheckWriteOperations(false);
        getHibernateTemplate().save(task);
    }

    public void delete(Task task) {
        getHibernateTemplate().delete(task);
    }

    public void update(Task task) {
        getHibernateTemplate().update(task);
    }

    public Task findById(int id) {
        return (Task) getHibernateTemplate().find("from Task c where taskid=?", id).get(0);
    }


}
