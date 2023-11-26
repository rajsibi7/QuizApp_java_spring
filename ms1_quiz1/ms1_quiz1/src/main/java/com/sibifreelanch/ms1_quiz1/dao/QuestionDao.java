package com.sibifreelanch.ms1_quiz1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sibifreelanch.ms1_quiz1.model.Question;

public interface QuestionDao extends CrudRepository<Question, Integer> {
	
	
	public List<Question> findByCategory(String category);
	
	@Query(value="SELECT * FROM question q 	where category = :category ORDER BY RAND() LIMIT :num ", nativeQuery=true)
	List<Question> findRandomQuestionByCategroy(String category, int num);

}
