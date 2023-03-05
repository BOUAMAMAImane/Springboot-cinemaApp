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
public class Place implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numero;
    private double logitude,latitude,altitude;
    @OneToMany(mappedBy = "place")
    private Collection<Ticket> ticket;
    @ManyToOne
    private Salle salle;
}
