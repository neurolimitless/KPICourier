package kpicourier.com;

import kpicourier.com.model.Client;
import kpicourier.com.model.Courier;
import kpicourier.com.model.Task;
import kpicourier.com.service.ClientService;
import kpicourier.com.service.CourierService;
import kpicourier.com.service.TaskService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestHibernate {
    private static int id = 1;
    private static int clientId = id;
    private static int courierId = id;
    private static int taskId = id;
    private static int amount = 1713;

    @Test
    public void addNewClient() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ClientService clientService = (ClientService) context.getBean("clientService");
        Client client = new Client();
        String username = "Test client ones";
        String email = "Test email";
        client.setUsername(username);
        client.setEmail(email);
        clientService.save(client);
        Client receivedClient = clientService.findByUsername(username);
        assertTrue(receivedClient.getEmail().equals(email));
    }

    @Test
    public void addNewCourier(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CourierService courierService = (CourierService) context.getBean("courierService");
        Courier courier = new Courier();
        String username = "Test username";
        String email = "Test email";
        courier.setUsername(username);
        courier.setEmail(email);
        courierService.save(courier);
        Courier receivedCourier = courierService.findByUsername(username);
        assertTrue(receivedCourier.getEmail().equals(email));
    }

    @Test
    public void addNewTask(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        TaskService taskService = (TaskService) context.getBean("taskService");
        Task task = new Task();
        task.setClientId(clientId);
        task.setExecutorId(courierId);
        task.setAmount(amount);
        taskService.save(task);
        Task receivedTask = taskService.findById(taskId);
        assertTrue(receivedTask.getAmount()==amount);
    }

}
