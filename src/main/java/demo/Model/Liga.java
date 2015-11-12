package demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Liga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    public Long id;

    @Column
    public String nombre;

    // una liga tendrá muchas temporadas
    @JsonIgnore
    @OneToMany(mappedBy = "liga")
    private Set<Temporada> temporada = new HashSet<>();


    public Liga() {

    }

// getters y setters

    public Set<Temporada> getTemporada() {
        return temporada;
    }

    public void setTemporada(Set<Temporada> temporada) {
        this.temporada = temporada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Liga{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}