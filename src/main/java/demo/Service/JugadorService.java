package demo.Service;

        import ch.qos.logback.core.net.SyslogOutputStream;
        import demo.Model.Jugador;
        import demo.Repository.JugadorRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Transactional;

        import java.util.*;

@Service
@Transactional

public class JugadorService {


    @Autowired
    private JugadorRepository jugadorRepository;


    public void registrarJugadores() {
        Calendar calendar = GregorianCalendar.getInstance();

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Ivan");
        calendar.set(1995, Calendar.AUGUST, 11);
        jugador1.setNacimiento(calendar.getTime());
        jugador1.setCanastas(5);
        jugador1.setAsistencias(10);
        jugador1.setRebotes(5);
        jugador1.setPosicion("base");
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Pedro");
        calendar.set(1990, Calendar.JANUARY, 25);
        jugador2.setNacimiento(calendar.getTime());
        jugador2.setCanastas(8);
        jugador2.setAsistencias(11);
        jugador2.setRebotes(2);
        jugador2.setPosicion("escolta");
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Kevin");
        calendar.set(1992, Calendar.SEPTEMBER, 2);
        jugador3.setNacimiento(calendar.getTime());
        jugador3.setCanastas(5);
        jugador3.setAsistencias(10);
        jugador3.setRebotes(8);
        jugador3.setPosicion("alero");
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Alvaro");
        calendar.set(1994, Calendar.MARCH, 12);
        jugador4.setNacimiento(calendar.getTime());
        jugador4.setCanastas(14);
        jugador4.setAsistencias(12);
        jugador4.setRebotes(3);
        jugador4.setPosicion("ala-pivot");
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador();
        jugador5.setNombre("Juan");
        calendar.set(1993, Calendar.APRIL, 18);
        jugador5.setNacimiento(calendar.getTime());
        jugador5.setCanastas(3);
        jugador5.setAsistencias(10);
        jugador5.setRebotes(2);
        jugador5.setPosicion("pivot");
        jugadorRepository.save(jugador5);

        // A. buscar jugador/es por nombre, sin necesidad de introducirlo entero
        System.out.println(jugadorRepository.findByNombreStartingWith("Iv"));

        // B. buscar jugadores que hayan conseguido un numero mayor o igual de canastas al
        // especificado como parametro
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(8));

        // C. buscar jugadores que hayn efectuado un numero de asistencias dentro de un rango
        // especificado como parametro
        System.out.println(jugadorRepository.findByAsistenciasBetween(2, 15));

        // D. buscar jugador/es que pertenezca a una posición concreta
        System.out.println(jugadorRepository.findByPosicionLike("base"));

        // E. buscar jugador/es que hayan nacido a una fecha anterior a una fecha especificada
        // como parametro
        calendar.set(1993, Calendar.APRIL, 18);
        System.out.println(jugadorRepository.findByNacimientoAfter(calendar.getTime()));

        // F. Combinar apartados B y E
        calendar.set(1993, Calendar.APRIL, 18);
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqualAndNacimientoAfter(8, calendar.getTime()));
                //jugadorRepository.findByNacimientoAfter(calendar.getTime());

        //System.out.print(jugador1.toString());
    }
}
