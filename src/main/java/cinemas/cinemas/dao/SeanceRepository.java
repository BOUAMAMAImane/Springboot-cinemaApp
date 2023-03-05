package cinemas.cinemas.dao;

import cinemas.cinemas.entities.Cinema;
import cinemas.cinemas.entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SeanceRepository extends JpaRepository<Seance,Long> {
    
}
