package com.dejota.dejotamovie.dto;

public class ScoreDTO {
	
	private Long MovieID;
	private String Email;
	private Double Score;
	
	public ScoreDTO() {
	}

	public Long getMovieID() {
		return MovieID;
	}

	public void setMovieID(Long movieID) {
		MovieID = movieID;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Double getScore() {
		return Score;
	}

	public void setScore(Double score) {
		Score = score;
	}
}
