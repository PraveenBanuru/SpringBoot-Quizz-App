package com.prav.quizapp.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Quiz {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)

	private Integer id;
	
	private String title;
	
	@ManyToMany
	private List<Question> questions;

	public void setTitle(String title2) {
		
		this.title=title2;
		
	}

	public void setQuestions(List<Question> questions2) {
		// TODO Auto-generated method stub
		
		this.questions=questions2;
		
	}
	
}
