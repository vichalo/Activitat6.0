package com.example.activitat6.Controller;

import com.example.activitat6.Class.Course;
import com.example.activitat6.Class.CourseMaterial;
import com.example.activitat6.Repository.CourseMatRep;
import com.example.activitat6.Repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class CourseMatController {
    private final CourseMatRep courseMatRep;

    @GetMapping("material")//
    public ResponseEntity<?> getMaterial(){
        List<CourseMaterial> cursos=courseMatRep.findAll();
        if(cursos.isEmpty()){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(cursos);
        }
    }

    @GetMapping("material/{id}")//path per obtenir un en concret
    public ResponseEntity<?> getMaterialId(@PathVariable Long id) {
        CourseMaterial courseMat=courseMatRep.findById(id).get();
        if (courseMat==null){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(courseMat);
        }
    }
}
