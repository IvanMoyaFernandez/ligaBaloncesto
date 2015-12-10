package demo.Repository;


import demo.Model.Equipo;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long> {
    public List<Equipo> findByNombreStartingWith(String nombreEquipo);

    public List<Equipo> findByNombre(String nombreEquipo);

    public List<Equipo> findByLocalidad(String localidadEquipo);

}