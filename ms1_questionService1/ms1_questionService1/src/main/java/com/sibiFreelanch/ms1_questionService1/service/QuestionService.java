package com.sibiFreelanch.ms1_questionService1.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sibiFreelanch.ms1_questionService1.Question;
import com.sibiFreelanch.ms1_questionService1.QuestionWrapper;
import com.sibiFreelanch.ms1_questionService1.Response;
import com.sibiFreelanch.ms1_questionService1.dao.QuestionRepo1;


@Service
public class QuestionService {
	
	@Autowired
	QuestionRepo1 questionRepo1;

	public ResponseEntity<List<Question>> getAllQuestions() {
		
		try {
			//return  (List<Question>) questionRepo1.findAll();
			return new ResponseEntity<>((List<Question>) questionRepo1.findAll(), HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
		
	}

	public List<Question> getQuestionByCategory(String category) {
		return (List<Question>) questionRepo1.findByCategory(category);
	}

	public Question addQuestion(Question newQustion) {
		return questionRepo1.save(newQustion);
		
	}

	public String deleteQuestion(int id) {
		// TODO Auto-generated method stub
		questionRepo1.deleteById(id);
		return "Deleted";
	}

	public Question updateQuestion(Question updateQustion) {
		// TODO Auto-generated method stub
		return questionRepo1.save(updateQustion);
		
	}

	public ResponseEntity<List<Integer>> generateQuestionForQuiz(String category, int numQuestions) {
		// TODO Auto-generated method stub
		System.out.println("QuestionService :: generateQuestionForQuiz:: category: "+ category +" NOQ: "+ numQuestions);
		List<Integer> questionList = questionRepo1.generateRandomQuestionForQuiz(category, numQuestions);
		System.out.println("QuestionService :: questionList received >>"+ questionList.toString());
		return new ResponseEntity(questionList, HttpStatus.OK);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuestionsById(List<Integer> qids) {
		// TODO Auto-generated method stub
		List<Question> q = new ArrayList();
		List<QuestionWrapper> qw = new ArrayList();
		for(Integer i : qids) {
			q.add(questionRepo1.findById(i).get());
		};
		
		for(Question ques : q) {
			QuestionWrapper wrapper = new QuestionWrapper();
			wrapper.setId(ques.getId());
			wrapper.setQuestion_title(ques.getQuestion_title());
			wrapper.setOption1(ques.getOption1());
			wrapper.setOption2(ques.getOption2());
			wrapper.setOption3(ques.getOption3());
			wrapper.setOption4(ques.getOption4());
			qw.add(wrapper);		
		};
		
		return new ResponseEntity(qw, HttpStatus.OK);
	}

	public ResponseEntity<Integer> getScore(List<Response> responses) {
		// TODO Auto-generated method stub
		int right = 0;	
		for(Response response: responses ) {
			Question question = questionRepo1.findById(response.getId()).get();
			
			if(response.getResponse().equals(question.getCorrect_answer())) {
				right++;
			}
		}
		return new ResponseEntity(right, HttpStatus.OK);
	}

}
