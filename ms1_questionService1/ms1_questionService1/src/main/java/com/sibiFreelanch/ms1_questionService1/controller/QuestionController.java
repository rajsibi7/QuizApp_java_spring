package com.sibiFreelanch.ms1_questionService1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sibiFreelanch.ms1_questionService1.Question;
import com.sibiFreelanch.ms1_questionService1.QuestionWrapper;
import com.sibiFreelanch.ms1_questionService1.Response;
import com.sibiFreelanch.ms1_questionService1.service.QuestionService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

	
	@Autowired
	QuestionService questionService;
	
	
	@GetMapping(path ="/getAllQuestions")
	public ResponseEntity<List<Question>> getAllQuestions() {		
		return questionService.getAllQuestions();	
	}
	
	@GetMapping(path ="/category/{cat}")
	public List<Question> getQuestionByCategory(@PathVariable("cat") String catrgory) {		
		return questionService.getQuestionByCategory(catrgory);	
	}
	
	@PostMapping("/add")
	public Question addQuestion(@RequestBody Question newQustion) {	
		return questionService.addQuestion(newQustion);
		
	}
	
	@DeleteMapping(path="/delete/{id}")
	public String deleteQuestion(@PathVariable int id) {
		return questionService.deleteQuestion(id);
	}
	
	@PutMapping(path="update")
	public Question updateQuestion(@RequestBody Question updateQustion) {
		return questionService.updateQuestion(updateQustion);
	}
	
	@GetMapping(path ="/generateQ")
	public ResponseEntity<List<Integer>> generateQuestionForQuiz(@RequestParam String category, @RequestParam int numQuestions) {		
		System.out.println("Question controller :: generateQuestionForQuiz:: category: "+ category +" NOQ: "+ numQuestions);
		return questionService.generateQuestionForQuiz(category, numQuestions);	
	};
	
	@PostMapping("/getQuizQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionsById(@RequestBody List<Integer> qids){
		System.out.println("qids :: "+ qids.toString());
		return questionService.getQuestionsById(qids);
	}
	
	@PostMapping("getScore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
		
		return questionService.getScore(responses);
		
	}

}
