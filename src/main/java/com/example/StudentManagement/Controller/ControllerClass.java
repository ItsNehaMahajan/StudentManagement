package com.example.StudentManagement.Controller;


import com.example.StudentManagement.DAO.StudentRepository;
import com.example.StudentManagement.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ControllerClass {

    StudentRepository studentRepository;

    @Autowired
    public ControllerClass(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping("/studentList")
    public String listOfStd(Model theModel){

        List<Student> studentList=studentRepository.findAll();
        theModel.addAttribute("Students",studentList);

        return "list";
    }
}
