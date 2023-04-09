package ejercicioP.data;

import ejercicioP.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    public Movie findByNameContaining(String name);


}
