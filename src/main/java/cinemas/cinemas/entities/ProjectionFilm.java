package cinemas.cinemas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectionFilm implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date dateProjection;
    private double prix;
    @OneToMany(mappedBy = "projectionFilm")
    private Collection<Ticket> ticket;
    @ManyToOne
    private Salle salle;
    @ManyToOne
    private Film film;
    @ManyToOne
    private Seance seance;
}
