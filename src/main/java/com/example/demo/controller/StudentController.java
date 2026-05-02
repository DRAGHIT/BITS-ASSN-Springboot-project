package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    // READ
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getStudentsWithCourses());
        return "students";
    }

    // CREATE FORM
    @GetMapping("/addStudent")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("courses", courseService.getAllCourses());
        return "add-student";
    }

    // CREATE
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    // UPDATE FORM
    @GetMapping("/editStudent/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        model.addAttribute("courses", courseService.getAllCourses());
        return "edit-student";
    }

    // UPDATE
    @PostMapping("/updateStudent")
    public String updateStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }
}
