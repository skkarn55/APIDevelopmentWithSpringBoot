package com.practice.APIDevelopment.services;

import com.practice.APIDevelopment.models.StudentBin;
import com.practice.APIDevelopment.repository.StudentRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//@Component("componentName") // annotation to inform Spring that Spring needs to create Object for this class
@Service
public class StudentInfoImpl implements StudentInfo{

    private StudentRepository studentRepo;

    public StudentInfoImpl(StudentRepository studentRepo){
        this.studentRepo = studentRepo;
        System.out.println("Bean for StudentRepository injected via Constructor Injection");
    }

    List<StudentBin> studentsFetched;

    public StudentInfoImpl(){
        System.out.println("StudentInfoImpl bean created");
    }

    @Override
    public List<StudentBin> getAllStudents() {
        System.out.println("Returning List of Students: ");

        return studentsFetched;
    }

   // @Override
    public StudentBin getStudent(int sRollNo) {
        return new StudentBin();
    }

    @Override
    public StudentBin addStudent(StudentBin studentBin) {
        studentRepo.save(studentBin);
        return null;
    }
}
