package com.example.demo.service;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentServiceTest {

    @Mock
    private StudentRepository studentRepo;

    @InjectMocks
    private StudentService studentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllStudents() {
        Student s1 = new Student("John", "john@mail.com", null);
        Student s2 = new Student("Jane", "jane@mail.com", null);
        when(studentRepo.findAll()).thenReturn(Arrays.asList(s1, s2));

        List<Student> students = studentService.getAllStudents();
        assertEquals(2, students.size());
        verify(studentRepo, times(1)).findAll();
    }

    @Test
    void testGetStudentById() {
        Student student = new Student("John", "john@mail.com", null);
        when(studentRepo.findById(1L)).thenReturn(Optional.of(student));

        Student found = studentService.getStudentById(1L);
        assertNotNull(found);
        assertEquals("John", found.getName());
    }

    @Test
    void testSaveStudent() {
        Student student = new Student("John", "john@mail.com", null);
        studentService.saveStudent(student);
        verify(studentRepo, times(1)).save(student);
    }
}
