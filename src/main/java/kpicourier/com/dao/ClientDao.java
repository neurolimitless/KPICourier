package kpicourier.com.dao;

import kpicourier.com.model.Client;

public interface ClientDao {
    void save(Client client);
    void update(Client client);
    void delete(Client client);
    Client findById(int id);
    Client findByUsername(String username);
}
