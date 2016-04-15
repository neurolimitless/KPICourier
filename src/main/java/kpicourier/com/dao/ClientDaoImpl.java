package kpicourier.com.dao;

import kpicourier.com.model.Client;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("clientDao")
@Transactional
public class ClientDaoImpl extends HibernateDaoSupport implements ClientDao {

    public void save(Client client) {
        getHibernateTemplate().setCheckWriteOperations(false);
        getHibernateTemplate().save(client);
    }

    public void update(Client client) {
        getHibernateTemplate().update(client);
    }

    public void delete(Client client) {
        getHibernateTemplate().delete(client);
    }

    public Client findById(int id) {
        List list = getHibernateTemplate().find("from Client c where c.id=?", id);
        return (Client) list.get(0);
    }

    public Client findByUsername(String username) {
        List list = getHibernateTemplate().find("from Client c where c.username=?", username);
        return (Client) list.get(0);
    }
}
