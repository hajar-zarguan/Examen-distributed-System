package examen.zarguan.microservice1.Commands.Aggregates;

import examen.zarguan.microservice1.CommonApi.Commands.CreateClientCommand;
import examen.zarguan.microservice1.CommonApi.Commands.UpdateClientCommand;
import examen.zarguan.microservice1.CommonApi.Commands.DeleteClientCommand;
import examen.zarguan.microservice1.CommonApi.Events.ClientCreatedEvent;
import examen.zarguan.microservice1.CommonApi.Events.ClientUpdatedEvent;
import examen.zarguan.microservice1.CommonApi.Events.ClientDeletedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class ClientAggregate {
    @AggregateIdentifier
    private String id;
    private String nom;
    private String addresse;
    private String mail;
    private String telephone;

    public ClientAggregate() {
    }
    @CommandHandler
    public ClientAggregate(CreateClientCommand command) {
        if (command.getTelephone() == null) {
            throw new RuntimeException("Telefone is required");
        }

        AggregateLifecycle.apply(new ClientCreatedEvent(
                command.getId(),command.getNom(),command.getAddresse(),command.getMail(),command.getTelephone()
        ));
    }

    @EventSourcingHandler
    public void on(ClientCreatedEvent event) {
        this.id = event.getId();
        this.nom = event.getNom();
        this.addresse = event.getAddresse();
        this.mail = event.getMail();
        this.mail = event.getTelephone();

    }


    @CommandHandler
    public void handle(UpdateClientCommand command) {
        if (command.getTelephone() == null) {
            throw new RuntimeException("Ne supprimer pas le numero de telephone");
        }

        AggregateLifecycle.apply(new ClientUpdatedEvent(
                command.getId(),command.getNom(),command.getAddresse(),command.getMail(),command.getTelephone()

        ));
    }

    @EventSourcingHandler
    public void on(ClientUpdatedEvent event) {

        this.nom = event.getNom();
        this.addresse = event.getAddresse();
        this.mail = event.getMail();
        this.mail = event.getTelephone();
    }   

    @CommandHandler
    public void handle(DeleteClientCommand command) {

        AggregateLifecycle.apply(new ClientDeletedEvent(
                command.getId()));
    }

    @EventSourcingHandler
    public void on(ClientDeletedEvent event) {
    }
    
}
