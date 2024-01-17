package com.prav.quizapp.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prav.quizapp.model.Question;
import com.prav.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
	
	@Query(value=" SELECT * FROM question q WHERE q.category= :category ORDER BY RANDOM() LIMIT = :numQ ", nativeQuery=true)
	List<Question> findRandomQuestionsByCategory(String category, int numQ);

}
