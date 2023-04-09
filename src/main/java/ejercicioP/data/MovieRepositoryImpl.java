package ejercicioP.data;

import ejercicioP.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieRepositoryImpl {
    @Autowired
    @Lazy

    private MovieRepository movieRepository;

    public List<Movie> getAll(){
        return movieRepository.findAll();
    }

    public void saveAll(List<Movie> movies){
        movieRepository.saveAll(movies);
    }


    public void save(Movie movie) {
        movieRepository.save(movie);
    }

    public Movie getById(Integer id) {
        if (movieRepository.findById(id).isPresent())
        {
            return movieRepository.findById(id).get();
        }

        throw new IllegalArgumentException("Id no existe en la BD");


    }
}
