package demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    public Long id;

    @Column
    public int anyo;

    // una temporada puede pertencer a una liga solo
    @ManyToOne
    private Liga liga;

    // en una temporada jugarán muchos equipos
    @JsonIgnore
    @ManyToMany
    private Set<Equipo> equipos = new HashSet<>();

    public Temporada() {

    }

// getters y setters

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int nombre) {
        this.anyo = nombre;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", año='" + anyo + '\'' +
                '}';
    }
}