package com.example.learning_navigator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learning_navigator.entity.Student;
import com.example.learning_navigator.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

  
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }


    public Student getStudentById(Long id) throws Exception {
        return studentRepository.findById(id)
                .orElseThrow(() -> new Exception("Student not found with ID: " + id));
    }

  
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


}

