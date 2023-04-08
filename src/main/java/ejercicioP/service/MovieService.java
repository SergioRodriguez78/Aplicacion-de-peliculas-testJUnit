package ejercicioP.service;

import ejercicioP.data.MovieRepository;
import ejercicioP.model.Genre;
import ejercicioP.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> findMoviesByGenre(Genre genre) {
        return null;
    }
}
