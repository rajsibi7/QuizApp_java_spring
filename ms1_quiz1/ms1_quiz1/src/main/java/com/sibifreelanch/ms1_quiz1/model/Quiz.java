package com.sibifreelanch.ms1_quiz1.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Quiz {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String title;
	//@ManyToMany
	@ElementCollection
	private List<Integer> questions;
	
	
	
	
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", title=" + title + ", questions=" + questions + "]";
	}
	
	public Quiz(long id, String title, List<Integer> questions) {
		super();
		this.id = id;
		this.title = title;
		this.questions = questions;
	}
	
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Integer> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Integer> questions) {
		this.questions = questions;
	}
	
}
