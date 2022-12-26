package examen.zarguan.microservice1.Query.Service;

import examen.zarguan.microservice1.CommonApi.Events.ClientCreatedEvent;
import examen.zarguan.microservice1.CommonApi.Events.ClientUpdatedEvent;
import examen.zarguan.microservice1.CommonApi.Events.ClientDeletedEvent;
import examen.zarguan.microservice1.CommonApi.Query.GetClientQuery;
import examen.zarguan.microservice1.CommonApi.Query.GetAllClientsQuery;
import examen.zarguan.microservice1.Query.Entity.Client;
import examen.zarguan.microservice1.Query.Repository.ClientRepository;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ClientServiceHandler {
    private ClientRepository clientRepository;

    public ClientServiceHandler(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @EventHandler
    public void on(ClientCreatedEvent event) {
        System.out.println("****************************");
        System.out.println("ClientCreatedEvent received");
        Client client = new Client();
        client.setId(event.getId());
        clientRepository.save(client);
    }



    @EventHandler
    public void on(ClientUpdatedEvent event) {
        System.out.println("****************************");
        System.out.println("ClientUpdatedEvent received");
        Client client = clientRepository.findById(event.getId()).get();
        clientRepository.save(client);
    }

    @EventHandler
    public void on(ClientDeletedEvent event) {
        System.out.println("****************************");
        System.out.println("ClientDeletedEvent received");
        Client client = clientRepository.findById(event.getId()).get();
        clientRepository.save(client);
    }

    @QueryHandler
    public List<Client> on(GetAllClientsQuery query) {
        return clientRepository.findAll();
    }

    @QueryHandler
    public Client on(GetClientQuery query) {
        return clientRepository.findById(query.getId()).get();
    }
}
