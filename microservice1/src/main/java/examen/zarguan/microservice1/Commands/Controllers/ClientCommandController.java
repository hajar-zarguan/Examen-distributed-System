package examen.zarguan.microservice1.Commands.Controllers;

import examen.zarguan.microservice1.CommonApi.Commands.CreateClientCommand;
import examen.zarguan.microservice1.CommonApi.Commands.UpdateClientCommand;

import examen.zarguan.microservice1.CommonApi.Commands.DeleteClientCommand;
import examen.zarguan.microservice1.CommonApi.DTO.CreateAccountRequestDTO;
import examen.zarguan.microservice1.CommonApi.DTO.UpdateClientRequestDTO;
import examen.zarguan.microservice1.CommonApi.DTO.DeleteClientRequestDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

@RestController
@RequestMapping(path = "/api/v1/clientCommands")
public class ClientCommandController {
    private CommandGateway cg;
    private EventStore es;

    public ClientCommandController(CommandGateway cg, EventStore es) {
        this.cg = cg;
        this.es = es;
    }

    public ClientCommandController() {
    }

    @PostMapping(path = "/createClient")
    public CompletableFuture<String> createAccount(@RequestBody CreateAccountRequestDTO request) {
        CompletableFuture<String> cr = cg.send(new CreateClientCommand(UUID.randomUUID().toString(),
                request.getNom(), request.getAddresse(),request.getMail(),request.getTelephone()));
        return cr;
    }

    @PutMapping(path = "/updateClient")
    public CompletableFuture<String> updateAccount(@RequestBody UpdateClientRequestDTO request) {
        CompletableFuture<String> cr = cg.send(new UpdateClientCommand(request.getId(), request.getNom(), request.getAddresse(),request.getMail(),request.getTelephone()));
        return cr;
    }

    @DeleteMapping (path = "/deleteClient")
    public CompletableFuture<String> deleteAccount(@RequestBody DeleteClientRequestDTO request) {
        CompletableFuture<String> cr = cg.send(new DeleteClientCommand(request.getId()));
        return cr;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        ResponseEntity<String> entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        return entity;
    }

    @GetMapping("/eventStore/{clientId}")
    public Stream eventStore(@PathVariable String clientId) {
        return es.readEvents(clientId).asStream();
    }
}
