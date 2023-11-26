package com.sibifreelanch.ms1_quiz1.model;

import java.util.List;

public class QuizWrapper {
	
	
	
	public QuizWrapper(int quizId, String quizTitle,  List<QuestionWrapper>questionList) {
		super();
		this.quizId = quizId;
		this.quizTitle = quizTitle;
		this.questionList = (List<QuestionWrapper>) questionList;
	}
	
	
	public QuizWrapper() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "QuizWrapper [quizId=" + quizId + ", quizTitle=" + quizTitle + ", questionList=" + questionList + "]";
	}
	
	public QuizWrapper(int quizId, String quizTitle) {
		super();
		this.quizId = quizId;
		this.quizTitle = quizTitle;
	}
	int quizId;
	public int getQuizId() {
		return quizId;
	}


	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}


	public String getQuizTitle() {
		return quizTitle;
	}


	public void setQuizTitle(String quizTitle) {
		this.quizTitle = quizTitle;
	}


	public List<QuestionWrapper> getQuestionList() {
		return questionList;
	}


	public void setQuestionList(List<QuestionWrapper> questionList2) {
		this.questionList = (List<QuestionWrapper>) questionList2;
	}
	String quizTitle;
	List<QuestionWrapper> questionList;
	
}
