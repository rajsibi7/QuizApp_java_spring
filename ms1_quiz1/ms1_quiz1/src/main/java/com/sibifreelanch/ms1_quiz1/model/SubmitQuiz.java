package com.sibifreelanch.ms1_quiz1.model;

import java.util.List;

public class SubmitQuiz {
	
	private long quizId;
	private List<QuizResponse> quizResponse;
	public SubmitQuiz(long quizId, List<QuizResponse> quizResponse) {
		super();
		this.quizId = quizId;
		this.quizResponse = quizResponse;
	}
	public SubmitQuiz() {
		super();
	}
	public long getQuizId() {
		return quizId;
	}
	public void setQuizId(long quizId) {
		this.quizId = quizId;
	}
	public List<QuizResponse> getQuizResponse() {
		return quizResponse;
	}
	public void setQuizResponse(List<QuizResponse> quizResponse) {
		this.quizResponse = quizResponse;
	}

	
	
}
