package com.example.learning_navigator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning_navigator.service.ExamService;

@RestController
@RequestMapping
public class ExamController {

    @Autowired
    private ExamService examService;

    @PostMapping("/exams/{examId}")
    public ResponseEntity<String> registerStudentForExam(@PathVariable Long examId, @RequestParam Long studentId) throws Exception {
        examService.registerStudentForExam(examId, studentId);
        return ResponseEntity.ok("Student registered for exam successfully!");
    }

   
}
