package com.dejota.dejotamovie.dto;

import com.dejota.dejotamovie.entities.Movie;

public class MovieDTO {

	private Long ID;
	private String Title;
	private Double Score;
	private Integer Count;
	private String Image;
	
	public MovieDTO() {
	}

	public MovieDTO(Long iD, String title, Double score, Integer count, String image) {
		ID = iD;
		Title = title;
		Score = score;
		Count = count;
		Image = image;
	}
	
	public MovieDTO(Movie movie) {
		ID = movie.getID();
		Title = movie.getTitle();
		Score = movie.getScore();
		Count = movie.getCount();
		Image = movie.getImage();
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Double getScore() {
		return Score;
	}

	public void setScore(Double score) {
		Score = score;
	}

	public Integer getCount() {
		return Count;
	}

	public void setCount(Integer count) {
		Count = count;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}
}
