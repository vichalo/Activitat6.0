package com.example.activitat6.Repository;

import com.example.activitat6.Class.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseMatRep extends CrudRepository<CourseMaterial,Long> {
    List<CourseMaterial>findAll();
}
