package com.example.StudentManagement.DAO;

import com.example.StudentManagement.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {


}
