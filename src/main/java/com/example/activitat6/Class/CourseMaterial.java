package com.example.activitat6.Class;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
public class CourseMaterial {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    @ManyToOne@JsonIgnore
    private Course course;

    public CourseMaterial(Long id, String url, Course course) {
        this.id = id;
        this.url = url;
        this.course = course;
    }

    public CourseMaterial() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


}
