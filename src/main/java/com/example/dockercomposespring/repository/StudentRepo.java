package com.example.dockercomposespring.repository;


import com.example.dockercomposespring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
