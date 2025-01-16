package com.example.learning_navigator.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="exams")
public class Exam {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long examId;

	    @ManyToOne
	 
	    private Subject subject;

	    @ManyToMany
	    private List<Student> students;

		public Long getExamId() {
			return examId;
		}

		public void setExamId(Long examId) {
			this.examId = examId;
		}

		public Subject getSubject() {
			return subject;
		}

		public void setSubject(Subject subject) {
			this.subject = subject;
		}

		public List<Student> getStudents() {
			return students;
		}

		public void setStudents(List<Student> students) {
			this.students = students;
		}

		public Exam(Long examId, Subject subject, List<Student> students) {
			this.examId = examId;
			this.subject = subject;
			this.students = students;
		}

		@Override
		public String toString() {
			return "Exam [examId=" + examId + ", subject=" + subject + ", students=" + students + "]";
		}

	   
	

}
