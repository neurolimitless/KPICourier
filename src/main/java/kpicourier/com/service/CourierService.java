package kpicourier.com.service;

import kpicourier.com.model.Courier;

public interface CourierService {
    void save(Courier courier);
    void delete(Courier courier);
    void update(Courier courier);
    Courier findById(int id);
    Courier findByUsername(String username);
}
