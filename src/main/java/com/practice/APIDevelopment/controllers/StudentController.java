package com.practice.APIDevelopment.controllers;

import com.practice.APIDevelopment.models.StudentBin;
import com.practice.APIDevelopment.services.StudentInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class StudentController {

    private final StudentInfo studentInfo;

    @GetMapping("/students")
    public List<StudentBin> returnAllStudents(){
        return studentInfo.getAllStudents();
    }

    @GetMapping("/student/{roll}")
    public StudentBin returnStudentByRollNo(@PathVariable("roll") int rollNo){
        return studentInfo.getStudent(rollNo);
    }

    public StudentBin addStudent(StudentBin studentBin){
        return studentInfo.addStudent(studentBin);
    }

}
