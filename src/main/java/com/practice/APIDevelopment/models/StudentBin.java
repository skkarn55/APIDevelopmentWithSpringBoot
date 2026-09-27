package com.practice.APIDevelopment.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentBin {

    @Id
    private int studRollNo;
    private int studAge;
    private String studName;

}
