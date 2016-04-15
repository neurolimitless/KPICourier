package kpicourier.com.service;

import kpicourier.com.dao.ClientDao;
import kpicourier.com.model.Client;

public class ClientServiceImpl implements ClientService {

    ClientDao clientDao;

    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public void save(Client client) {
        clientDao.save(client);
    }

    public void update(Client client) {
        clientDao.update(client);
    }

    public void delete(Client client) {
        clientDao.delete(client);
    }

    public Client findById(int id) {
       return clientDao.findById(id);
    }

    public Client findByUsername(String username) {
        return clientDao.findByUsername(username);
    }

}
