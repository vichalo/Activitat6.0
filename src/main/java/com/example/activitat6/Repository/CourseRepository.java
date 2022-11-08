package com.example.activitat6.Repository;

import com.example.activitat6.Class.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,Long> {
    List<Course> findAll();
}
