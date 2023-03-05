package cinemas.cinemas.dao;

import cinemas.cinemas.entities.Cinema;
import cinemas.cinemas.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FilmRepository extends JpaRepository<Film,Long> {
    
}
