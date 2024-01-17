package com.prav.quizapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prav.quizapp.model.Question;
import com.prav.quizapp.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuizController {
	
	@Autowired
	QuestionService questionService;
	
	
	@GetMapping("allQuestions")
	public ResponseEntity<List<Question>> getAllQuestions() {
		
		System.out.print(" in get All Questions");
	System.out.print(questionService.getAllQuestions().toString());
		
		return questionService.getAllQuestions();
	}
	
	
	@GetMapping("category/{category}")
	public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
		
		
		
		return questionService.getQuestionsByCategory(category);
		
	}
	
	@PostMapping("add")

	public ResponseEntity<String> addQuestion(@RequestBody Question question) {
		
		
		return questionService.addQuestion(question);
	}
	
}
