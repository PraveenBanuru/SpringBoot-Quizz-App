package com.prav.quizapp.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prav.quizapp.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {

	List<Question> findByCategory(String category);



}
