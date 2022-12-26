package examen.zarguan.microservice1.CommonApi.Commands;

public class DeleteClientCommand extends BaseCommand<String> {
    private String id;


    public DeleteClientCommand(String id) {
        super(id);
    }


}