package com.sibifreelanch.ms1_quiz1.model;

public class QuizResponse {

	public QuizResponse(Integer id, String response) {
		super();
		this.id = id;
		this.response = response;
	}
	
	
	
	
	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getResponse() {
		return response;
	}




	public void setResponse(String response) {
		this.response = response;
	}




	public QuizResponse() {
		super();
	}




	private Integer id;
	private String response;
}
