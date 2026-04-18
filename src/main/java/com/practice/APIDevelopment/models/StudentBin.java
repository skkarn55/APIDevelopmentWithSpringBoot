package com.practice.APIDevelopment.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Primary;

@Entity
public class StudentBin {


    public StudentBin(int studAge, String studName, int studRollNo) {
        this.studAge = studAge;
        this.studName = studName;
        this.studRollNo = studRollNo;
    }

    public StudentBin(){

    }

    private int studAge;
    private String studName;
    @Id
    private int studRollNo;

    public int getStudAge() {
        return studAge;
    }

    public void setStudAge(int studAge) {
        this.studAge = studAge;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getStudRollNo() {
        return studRollNo;
    }

    public void setStudRollNo(int studRollNo) {
        this.studRollNo = studRollNo;
    }
}
