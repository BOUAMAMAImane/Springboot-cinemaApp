package cinemas.cinemas.dao;

import cinemas.cinemas.entities.Categorie;
import cinemas.cinemas.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TicketRepository extends JpaRepository<Ticket,Long> {
    
}
