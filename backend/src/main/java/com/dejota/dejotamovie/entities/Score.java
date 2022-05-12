package com.dejota.dejotamovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePK ID = new ScorePK();
	private Double Value;
	
	public Score() {
	}
	
	public void setMovie(Movie movie) {
		ID.setMovie(movie);
	}
	
	public void setUser(User user) {
		ID.setUser(user);
	}

	public ScorePK getID() {
		return ID;
	}

	public void setID(ScorePK iD) {
		ID = iD;
	}

	public Double getValue() {
		return Value;
	}

	public void setValue(Double value) {
		Value = value;
	}
}
