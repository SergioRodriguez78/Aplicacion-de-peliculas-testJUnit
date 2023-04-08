package ejercicioP.service;

import ejercicioP.model.Genre;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieServiceTest {
    MovieService movieService= new MovieService();

    @Test
    public void returnMoviesByGenre() {
        movieService.findMoviesByGenre(Genre.COMEDY);

    }
}