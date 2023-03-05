package cinemas.cinemas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Data@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Film implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titre;
    private double duree;
    private String realisateur,description,photo;
    private Date DateSortie;
    @ManyToOne
    private Categorie categorie;
    @OneToMany(mappedBy = "film")
    private Collection<ProjectionFilm> projectionFilm;
}
