package com.example.spring.libraryManagementExample.Repository;

import com.example.spring.libraryManagementExample.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
