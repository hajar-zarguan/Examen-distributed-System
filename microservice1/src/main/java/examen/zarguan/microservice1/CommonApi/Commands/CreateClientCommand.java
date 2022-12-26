package examen.zarguan.microservice1.CommonApi.Commands;

public class CreateClientCommand extends BaseCommand<String> {

    private String nom;
    private String addresse;
    private String mail;
    private String telephone;

    public CreateClientCommand(String id, String nom, String addresse, String mail, String telephone) {
        super(id);
        this.nom = nom;
        this.addresse = addresse;
        this.mail = mail;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
