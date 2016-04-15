package kpicourier.com.service;

import kpicourier.com.dao.CourierDao;
import kpicourier.com.model.Courier;

public class CourierServiceImpl implements CourierService {

    CourierDao courierDao;

    public void setCourierDao(CourierDao courierDao) {
        this.courierDao = courierDao;
    }

    public void save(Courier courier) {
        courierDao.save(courier);
    }

    public void delete(Courier courier) {
        courierDao.delete(courier);
    }

    public void update(Courier courier) {
        courierDao.update(courier);
    }

    public Courier findById(int id) {
        return courierDao.findById(id);
    }

    public Courier findByUsername(String username) {
        return courierDao.findByUsername(username);
    }
}
