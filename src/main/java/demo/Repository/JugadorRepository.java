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
    Jugador findFirstByOrderByCanastasDesc();

    // E
    public List<Jugador> findFirst5ByOrderByAsistenciasDesc();
    // F
    // @Query("SELECT j FROM Jugador j WHERE j.equipo.nombre = :equipoNombre ORDER BY j.canastas DESC")
    // List<Jugador> findByEquipoNombreAndCanastas(String nombreEquipo);
}
