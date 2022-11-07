package com.example.activitat6.Controller;

import com.example.activitat6.Class.Course;
import com.example.activitat6.Repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class CouseController {
    @Autowired
    private final CourseRepository courseRepository;

    @GetMapping("cursos")//
    public ResponseEntity<?>getGrups(){
        List<Course>cursos=courseRepository.findAll();
        if(cursos.isEmpty()){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(cursos);
        }
    }

    @GetMapping("course/{id}")//path per obtenir un course en concret
    public ResponseEntity<?> getAlumne(@PathVariable long id) {
        Course course=courseRepository.getReferenceById(id);
        if (course==null){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(course);
        }
    }

}
