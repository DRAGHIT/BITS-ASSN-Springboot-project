package com.example.demo.config;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CourseRepository courseRepo;

    @Autowired
    private StudentRepository studentRepo;

    @Override
    public void run(String... args) {
        // Clear existing data
        studentRepo.deleteAll();
        courseRepo.deleteAll();

        // Populate 10 Courses
        for (int i = 1; i <= 10; i++) {
            Course c = new Course("Course " + i);
            courseRepo.save(c);
        }

        List<Course> courses = courseRepo.findAll();

        // Populate 10 Students
        for (int i = 1; i <= 10; i++) {
            Student s = new Student();
            s.setName("Student " + i);
            s.setEmail("student" + i + "@mail.com");
            s.setCourse(courses.get((i - 1) % courses.size()));
            studentRepo.save(s);
        }
    }
}
