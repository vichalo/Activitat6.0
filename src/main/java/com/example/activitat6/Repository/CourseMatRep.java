package com.example.activitat6.Repository;

import com.example.activitat6.Class.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMatRep extends JpaRepository<CourseMaterial,Long> {
}
