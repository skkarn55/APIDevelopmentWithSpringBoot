package com.practice.APIDevelopment.repository;

import com.practice.APIDevelopment.models.StudentBin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentBin, Integer> {

}
