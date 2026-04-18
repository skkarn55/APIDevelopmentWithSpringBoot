package com.practice.APIDevelopment.services;

import com.practice.APIDevelopment.models.StudentBin;

import java.util.List;

public interface StudentInfo {
    List<StudentBin> getAllStudents();
    StudentBin getStudent(int sRollNo);
}
