package com.hibernate.hib.map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_question")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String question;
	
	@OneToMany(cascade = {CascadeType.ALL},mappedBy = "question")
	private List<Answer> answer;
	
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public List<Answer> getAnswer() {
		return answer;
	}


	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}


	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Question(int id, String question, List<Answer> answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	
	

}
