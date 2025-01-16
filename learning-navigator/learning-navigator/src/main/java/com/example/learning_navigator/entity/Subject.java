package com.example.learning_navigator.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subjectId;
	private String subjectName;

	@ManyToMany

	private List<Student> students;

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", students=" + students + "]";
	}

	
}
