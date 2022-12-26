package examen.zarguan.microservice1.CommonApi.DTO;

import lombok.Data;

@Data
public class CreateAccountRequestDTO {
    private String id;
    private String nom;
    private String addresse;
    private String mail;
    private String telephone;

}
