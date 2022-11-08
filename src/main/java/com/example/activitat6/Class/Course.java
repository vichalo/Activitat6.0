package com.example.activitat6.Class;
import org.hibernate.annotations.GeneratorType;
import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    @OneToMany(mappedBy = "course")
    private List<CourseMaterial> courseMaterial;

    public Course(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Course() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<CourseMaterial> getCourseMaterial() {
        return courseMaterial;
    }

    public void setCourseMaterial(List<CourseMaterial> courseMaterial) {
        this.courseMaterial = courseMaterial;
    }
}
