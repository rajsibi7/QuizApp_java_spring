package com.sibifreelanch.ms1_quiz1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sibifreelanch.ms1_quiz1.dao.QuestionDao;
import com.sibifreelanch.ms1_quiz1.dao.QuizDao;
import com.sibifreelanch.ms1_quiz1.model.Question;
import com.sibifreelanch.ms1_quiz1.model.QuestionWrapper;
import com.sibifreelanch.ms1_quiz1.model.Quiz;
import com.sibifreelanch.ms1_quiz1.model.QuizWrapper;
import com.sibifreelanch.ms1_quiz1.model.SubmitQuiz;





@Service
public class QuizService {
	
	@Autowired
	QuizDao quizDao;
	
	@Autowired
	QuizInterface quizInterface;
	

	public String createQuiz(String category, int noOfQuestions, String title) {
		
		List<Integer> questionIds = (List<Integer>) quizInterface.generateQuestionForQuiz(category, noOfQuestions).getBody();
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(questionIds);
		quizDao.save(quiz);
		System.out.println("HEY Result ==== " + quiz.toString());
		return "Success";
		
		}

	public List<QuestionWrapper> getQuiz(int quizId) {
		
		Optional<Quiz> quiz = quizDao.findById(quizId);
		List<Integer> questionIds = quiz.get().getQuestions();
		List<QuestionWrapper> questionList = quizInterface.getQuestionsById(questionIds).getBody();
		System.out.println("questionIds list"+ questionList.toString());
		return questionList;
		
	}

	public ResponseEntity<Integer> submitQuiz(SubmitQuiz requestBody) {
		
		return quizInterface.getScore(requestBody.getQuizResponse());
	}
}
