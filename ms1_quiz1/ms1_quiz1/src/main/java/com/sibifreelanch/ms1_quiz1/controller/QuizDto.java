package com.sibifreelanch.ms1_quiz1.controller;

public class QuizDto {
	
	String category;
	public QuizDto() {
		super();
	}
	int noOfQuestions;
	String title;
	
	
	public QuizDto(String category, int noOfQuestions, String title) {
		super();
		this.category = category;
		this.noOfQuestions = noOfQuestions;
		this.title = title;
	}
	
	
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getNoOfQuestions() {
		return noOfQuestions;
	}
	public void setNoOfQuestions(int noOfQuestions) {
		this.noOfQuestions = noOfQuestions;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
