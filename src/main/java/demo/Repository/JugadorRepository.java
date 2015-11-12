package demo.Repository;


import demo.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long>{
    public List<Jugador> findByNombreStartingWith (String nombreJugador);
    public List<Jugador> findByCanastasGreaterThanEqual (int numCanastas);
    public List<Jugador> findByAsistenciasBetween (int minAsistencias, int maxAsistencias);
    public List<Jugador> findByPosicionLike (String posicion);
    public List<Jugador> findByNacimientoAfter (Date nacimiento);
    public List<Jugador> findByCanastasGreaterThanEqualAndNacimientoAfter (int canastas, Date nacimiento);

    // practica 2
    // B
    public List<Jugador> findByEquipoNombre(String nombreEquipo);

    // C
    public List<Jugador> findByEquipoNombreAndPosicion(String nombreEquipo, String posicion);

    // D
    public List<Jugador> findFirstByOrderByCanastasDesc();

    // E
    public List<Jugador> findFirstByOrderByAsistenciasDesc();
    // F
    // @Query("select j from Jugador j where j.equipo.nombre = :equipo ORDER BY j.canastas DESC")
    // List<Jugador> findByEquipoNombreAndCanastas(@Param("equipo") String equipoNombre, Pageable pageable);
}
