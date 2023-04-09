package ejercicioP.controller;

import ejercicioP.data.MovieRepositoryImpl;
import ejercicioP.model.Genre;
import ejercicioP.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MovieController {
@Autowired
    MovieRepositoryImpl movieRepository;
    @GetMapping("/movies")
    public List<Movie> getMovies(){
        movieRepository.saveAll(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION) ,
                new Movie(2, "Memento", 113, Genre.THRILLER) ,
                new Movie(3, "Matrix", 136, Genre.ACTION)));
       return movieRepository.getAll();

    }


}
