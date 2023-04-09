package ejercicioP.model;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;


public enum Genre {
    ACTION, COMEDY, DRAMA, HORROR, THRILLER;

    Genre() {
    }

}