package ejercicioP.service;

import ejercicioP.data.MovieRepository;
import ejercicioP.model.Genre;
import ejercicioP.model.Movie;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceTest {
    MovieRepository movieRepository;
    MovieService movieService;

    @Before
    public void setUp() throws Exception {
      movieRepository= Mockito.mock(MovieRepository.class);
        movieService= new MovieService(movieRepository);

        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "There's Something About Marty", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY),
                        new Movie(7, "Matrix", 136, Genre.ACTION))
        );
    }

    @Test
    public void returnMoviesByGenre() {


      List<Movie> movies= movieService.findMoviesByGenre(Genre.COMEDY);

        assertEquals(Arrays.asList(3,6), getMoviesId(movies));
    }

    @Test
    public void returnMoviesByLength() {
        List<Movie> movies= movieService.findMoviesByLength(119);

        assertEquals(Arrays.asList(2,3,4,5,6), getMoviesId(movies));

    }

    private static List<Integer> getMoviesId(List<Movie> movies) {
        return movies.stream().map(Movie::getId).collect(Collectors.toList());
    }
}