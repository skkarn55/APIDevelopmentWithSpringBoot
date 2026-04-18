package com.practice.APIDevelopment.services;

import com.practice.APIDevelopment.models.StudentBin;
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

    StudentBin studentBin;
    Configuration configuration;
    SessionFactory sessionFactory;
    Session session;
    Transaction transaction;

    List<StudentBin> studentsToAdd, studentsFetched;

    private void configureDB(){
        studentBin = new StudentBin();
        configuration = new Configuration();
        configuration.configure("dbConnection.xml");
        configuration.addAnnotatedClass(com.practice.APIDevelopment.models.StudentBin.class);
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();



    }
    public StudentInfoImpl(){
        configureDB();

        session.persist(new StudentBin(12, "ABC", 2));
        session.persist(new StudentBin(13, "DEF", 3));
        session.persist(new StudentBin(14, "GHE", 4));
        transaction.commit();

        System.out.println("Object created for StudentInfoImpl");

        studentsFetched = new ArrayList<>();
        studentsFetched.add(session.find(StudentBin.class, "2"));

    }

    @Override
    public List<StudentBin> getAllStudents() {
        System.out.println("Returning List of Students: ");

        return studentsFetched;
    }

   // @Override
    public StudentBin getStudent(int sRollNo) {
        return session.find(StudentBin.class, sRollNo);
    }
}
