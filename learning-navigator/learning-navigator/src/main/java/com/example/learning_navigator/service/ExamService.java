package com.example.learning_navigator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learning_navigator.entity.Exam;
import com.example.learning_navigator.entity.Student;
import com.example.learning_navigator.repository.ExamRepository;
import com.example.learning_navigator.repository.StudentRepository;
import com.example.learning_navigator.repository.SubjectRepository;


@Service
public class ExamService  {

    @Autowired
    private ExamRepository examRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

 
    public Exam createExam(Exam exam) {
        return examRepository.save(exam);
    }

 
    public Exam getExamById(Long id) throws Exception {
        return examRepository.findById(id)
                .orElseThrow(() -> new Exception("Exam not found with ID: " + id));
    }


    public void registerStudentForExam(Long examId, Long studentId) throws Exception {
        Exam exam = getExamById(examId);
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new Exception("Student not found with ID: " + studentId));

        // Ensure the student is enrolled in the subject associated with the exam
        if (!student.getSubjects().contains(exam.getSubject())) {
            throw new IllegalStateException("Student must be enrolled in the subject before registering for the exam.");
        }

        exam.getStudents().add(student);
        student.getExams().add(exam);

        examRepository.save(exam); // Save to update both sides of the relationship
        studentRepository.save(student);
    }
}

