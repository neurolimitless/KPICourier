package kpicourier.com.dao;

import kpicourier.com.model.Courier;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("courierDao")
@Transactional
public class CourierDaoImpl extends HibernateDaoSupport implements CourierDao {

    public void save(Courier courier) {
        getHibernateTemplate().setCheckWriteOperations(false);
        getHibernateTemplate().save(courier);
    }

    public void update(Courier courier) {
        getHibernateTemplate().update(courier);
    }

    public void delete(Courier courier) {
        getHibernateTemplate().delete(courier);
    }

    public Courier findById(int id) {
        return (Courier) getHibernateTemplate().find("from Courier c where id=?", id).get(0);
    }

    public Courier findByUsername(String username) {
        return (Courier) getHibernateTemplate().find("from Courier c where username=?", username).get(0);
    }
}
