package kpicourier.com.dao;

import kpicourier.com.model.Courier;

public interface CourierDao {
    void save(Courier courier);
    void delete(Courier courier);
    void update(Courier courier);
    Courier findById(int id);
    Courier findByUsername(String username);
}
