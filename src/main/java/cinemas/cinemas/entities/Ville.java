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
public class Ville implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String nom;
        private double logitude,latitude,altitude;
        @OneToMany(mappedBy = "ville")
        private Collection<Cinema> cinema;
}
