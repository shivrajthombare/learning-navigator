package com.example.learning_navigator.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registrationId;
    private String name;

    @ManyToMany(mappedBy = "students")
    private List<Subject> subjects;

    @ManyToMany
    private List<Exam> exams;

	public Long getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Long registrationId) {
		this.registrationId = registrationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	@Override
	public String toString() {
		return "Student [registrationId=" + registrationId + ", name=" + name + ", subjects=" + subjects + ", exams="
				+ exams + "]";
	}
    
    
    

}

