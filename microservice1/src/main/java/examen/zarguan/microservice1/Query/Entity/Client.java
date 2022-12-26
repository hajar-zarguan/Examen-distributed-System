package examen.zarguan.microservice1.Query.Entity;
import lombok.Data;
import javax.persistence.*;

@Entity @Data
public class Client {
    @Id
    private String id;
    private String nom;
    private String addresse;
    private String mail;
    private String telephone;


    public Client() {
    }

    public Client(String id, String nom, String addresse, String mail, String telephone) {
        this.id = id;
        this.nom = nom;
        this.addresse = addresse;
        this.mail = mail;
        this.telephone = telephone;
    }

}
