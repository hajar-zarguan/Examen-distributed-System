package examen.zarguan.microservice1.CommonApi.Events;

import lombok.Data;


public class ClientDeletedEvent extends BaseEvent<String> {
    private String id;

    public ClientDeletedEvent(String id) {
        super(id);
    }


    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
