package examen.zarguan.microservice1.Query.Controller;

import examen.zarguan.microservice1.CommonApi.Query.GetClientQuery;
import examen.zarguan.microservice1.CommonApi.Query.GetAllClientsQuery;
import examen.zarguan.microservice1.Query.Entity.Client;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/clientQueries")
public class QueryClientController {
    private QueryGateway queryGateway;

    public QueryClientController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @GetMapping(path = "/allClients")
    public List<Client> getAccounts() {
        return queryGateway.query(new GetAllClientsQuery(), ResponseTypes.multipleInstancesOf(Client.class)).join();
    }
    
    @GetMapping(path="/getClient/{id}")
    public Client getAccount(@PathVariable String id) {
        return queryGateway.query(new GetClientQuery(id), ResponseTypes.instanceOf(Client.class)).join();
    }
}
