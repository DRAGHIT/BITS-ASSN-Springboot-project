package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public List<Student> getStudentsWithCourses() {
        return studentRepo.getStudentsWithCourses();
    }

    public void saveStudent(Student student) {
        studentRepo.save(student);
    }

    public Student getStudentById(Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}
