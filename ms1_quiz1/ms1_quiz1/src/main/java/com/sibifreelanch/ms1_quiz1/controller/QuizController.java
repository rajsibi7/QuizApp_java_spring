package com.sibifreelanch.ms1_quiz1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sibifreelanch.ms1_quiz1.model.QuestionWrapper;
import com.sibifreelanch.ms1_quiz1.model.QuizWrapper;
import com.sibifreelanch.ms1_quiz1.model.SubmitQuiz;
import com.sibifreelanch.ms1_quiz1.service.QuizService;



@RestController
@RequestMapping("quiz")
public class QuizController {
	
	@Autowired
	QuizService quizService;

@PostMapping(path="create")
public String createQuiz(@RequestBody QuizDto quizDto) {
	
	return quizService.createQuiz(quizDto.getCategory(), quizDto.getNoOfQuestions(), quizDto.getTitle());	
};

@GetMapping(path="/getQuiz")
public List<QuestionWrapper> getQuiz(@RequestParam(defaultValue = "empty") int quizId) {
	
	return quizService.getQuiz(quizId);
}

@PostMapping("/submitQuiz")
public ResponseEntity<Integer> submitQuiz(@RequestBody SubmitQuiz responseBody) {
	
	return quizService.submitQuiz(responseBody);
}

}
