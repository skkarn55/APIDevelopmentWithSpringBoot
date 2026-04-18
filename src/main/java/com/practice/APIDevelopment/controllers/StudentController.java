package com.practice.APIDevelopment.controllers;

import com.practice.APIDevelopment.models.StudentBin;
import com.practice.APIDevelopment.services.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    private StudentInfo studInfo;

    public StudentInfo getStudInfo() {
        return studInfo;
    }


    public void setStudInfo(StudentInfo studInfo) {
        this.studInfo = studInfo;
    }

    public StudentController(StudentInfo studInfo) {
        this.studInfo = studInfo;
    }

    @GetMapping("/home")
public List<String> getHome(){
    List<String> strList = new ArrayList<>();
    strList.add("in Home");
    strList.add("nice home");
    return strList;
}

    @GetMapping("/students")
    public List<StudentBin> returnAllStudents(){
        return studInfo.getAllStudents();
    }

    @GetMapping("/student/{roll}")
    public StudentBin returnStudentByRollNo(@PathVariable("roll") int rollNo){
        return studInfo.getStudent(rollNo);
    }
}
