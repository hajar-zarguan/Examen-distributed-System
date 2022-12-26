package examen.zarguan.microservice1.Query.Repository;

import examen.zarguan.microservice1.Query.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, String> {

}

