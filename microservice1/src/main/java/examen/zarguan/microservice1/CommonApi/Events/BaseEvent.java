package examen.zarguan.microservice1.CommonApi.Events;

public abstract class BaseEvent<T> {
    private T id;
    public BaseEvent(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}
