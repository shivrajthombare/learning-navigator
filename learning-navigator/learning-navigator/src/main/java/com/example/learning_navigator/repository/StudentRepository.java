package com.example.learning_navigator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learning_navigator.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
