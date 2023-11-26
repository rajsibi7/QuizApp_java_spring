package com.sibifreelanch.ms1_quiz1.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.sibifreelanch.ms1_quiz1.model.QuestionWrapper;
import com.sibifreelanch.ms1_quiz1.model.QuizResponse;



@FeignClient("QUESTION-SERVICE")
public interface QuizInterface {
	
	@GetMapping(path ="/question/generateQ")
	public ResponseEntity<List<Integer>> generateQuestionForQuiz(@RequestParam String category, @RequestParam int numQuestions);
	
	@PostMapping("/question/getQuizQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionsById(@RequestBody List<Integer> qids);
	
	@PostMapping("/question/getScore")
	public ResponseEntity<Integer> getScore(@RequestBody List<QuizResponse> responses);

}
