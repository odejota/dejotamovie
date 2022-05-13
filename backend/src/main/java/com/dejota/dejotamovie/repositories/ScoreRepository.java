package com.dejota.dejotamovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dejota.dejotamovie.entities.Score;
import com.dejota.dejotamovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}