package ejercicioP.data;

import ejercicioP.model.Genre;
import ejercicioP.model.Movie;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;
import org.springframework.test.context.jdbc.Sql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.Assert.*;
@DataJpaTest
public class MovieRepositoryImplTest {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private MovieRepositoryImpl implementacion;

    @BeforeEach
     void setUp() {
        movieRepository.saveAll(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION) ,
                new Movie(2, "Memento", 113, Genre.THRILLER) ,
                new Movie(3, "Matrix", 136, Genre.ACTION)));
    }

    @Test
    public void saveElements(){
        Movie movie= new Movie( 4,"Dark Soul", 120, Genre.ACTION);

        implementacion.save(movie);
        assertEquals(new Movie( 4,"Dark Soul", 120, Genre.ACTION),implementacion.getById(4));



    }

    @Test
    void finAllTest() {

        List<Movie> movies= implementacion.getAll();
         assertEquals(Arrays.asList(
               new Movie(1, "Dark Knight", 152, Genre.ACTION) ,
                new Movie(2, "Memento", 113, Genre.THRILLER) ,
              new Movie(3, "Matrix", 136, Genre.ACTION)
         ), movies);

    }

}