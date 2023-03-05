package cinemas.cinemas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
@Data@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Salle implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
     private String nom;
     private int nombrePlace;
     @ManyToOne
     private Cinema cinema;
     @OneToMany(mappedBy = "salle")
     private Collection<ProjectionFilm> projectionFilm;
     @OneToMany(mappedBy = "salle")
     private Collection<Place> place;

}
