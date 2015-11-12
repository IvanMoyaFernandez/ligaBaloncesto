package demo.Repository;


import demo.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface LigaRepository extends PagingAndSortingRepository<Liga, Long> {
    public List<Liga> findByNombreStartingWith(String nombreLiga);

    Liga findByNombre(String nombreLiga);
}