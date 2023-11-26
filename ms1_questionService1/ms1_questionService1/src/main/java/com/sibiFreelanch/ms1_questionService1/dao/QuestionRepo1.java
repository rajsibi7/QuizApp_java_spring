package com.sibiFreelanch.ms1_questionService1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

import com.sibiFreelanch.ms1_questionService1.Question;

public interface QuestionRepo1 extends CrudRepository<Question, Integer> {
	
	
	public List<Question> findByCategory(String category);
	
	@Query(value="SELECT * FROM question q 	where category = :category ORDER BY RAND() LIMIT :num ", nativeQuery=true)
	List<Question> findRandomQuestionByCategroy(String category, int num);
	
	
	@Query(value = "SELECT id from question q where category = :category ORDER BY RAND() LIMIT :num ", nativeQuery=true)
	public List<Integer> generateRandomQuestionForQuiz(String category, int num);

}
