package examen.zarguan.microservice1.CommonApi.Query;

public class GetClientQuery {
    private String id;

    public GetClientQuery() {
    }

    public GetClientQuery(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
