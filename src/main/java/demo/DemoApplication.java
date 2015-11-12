package demo;

import demo.Service.LigaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    //private static JugadorService jugadorService;
    private static LigaService ligaService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
        ligaService = context.getBean(LigaService.class);
        ligaService.registrarEquipo();
        ligaService.registrarJugadores();
        ligaService.registrarLiga();
        ligaService.registrarTemporada();
        ligaService.consultas();
    }

}
