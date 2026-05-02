package com.example.demo.service;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepo;

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public void saveCourse(Course course) {
        courseRepo.save(course);
    }

    public Course getCourseById(Long id) {
        return courseRepo.findById(id).orElse(null);
    }
}
