package cinemas.cinemas.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class Cinema implements Serializable {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private double logitude,latitude,altitude;
    private int nombreSalles;
    @ManyToOne()
    private  Ville ville;
    @OneToMany(mappedBy = "cinema")
    private Collection<Salle> salle;
}
