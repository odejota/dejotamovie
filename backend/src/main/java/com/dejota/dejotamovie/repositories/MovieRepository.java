package com.dejota.dejotamovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dejota.dejotamovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}