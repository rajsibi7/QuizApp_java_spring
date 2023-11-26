package com.sibiFreelanch.ms1_questionService1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Question {
	
	@Id
	int id;
	public Question(int id, String category, String diffculty, String question_title, String option1,
			String option2, String option3, String option4, String correct_answer) {
		super();
		this.id = id;
		this.category = category;
		this.diffculty = diffculty;
		this.question_title = question_title;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correct_answer = correct_answer;
	}
	public Question() {
		super();
	}
	String category;
	String diffculty;
	String question_title;
	String option1;
	String option2;
	String option3;
	String option4;
	String correct_answer;
	
	
	@Override
	public String toString() {
		return "QuestionEntity [id=" + id + ", category=" + category + ", diffculty=" + diffculty + ", question_title="
				+ question_title + ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3
				+ ", option4=" + option4 + ", correct_answer=" + correct_answer + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDiffculty() {
		return diffculty;
	}
	public void setDiffculty(String diffculty) {
		this.diffculty = diffculty;
	}
	public String getQuestion_title() {
		return question_title;
	}
	public void setQuestion_title(String question_title) {
		this.question_title = question_title;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getCorrect_answer() {
		return correct_answer;
	}
	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}
	
	

}
