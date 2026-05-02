package com.example.demo.service;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class CourseServiceTest {

    @Mock
    private CourseRepository courseRepo;

    @InjectMocks
    private CourseService courseService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllCourses() {
        Course c1 = new Course("Java");
        Course c2 = new Course("Spring");
        when(courseRepo.findAll()).thenReturn(Arrays.asList(c1, c2));

        List<Course> courses = courseService.getAllCourses();
        assertEquals(2, courses.size());
        verify(courseRepo, times(1)).findAll();
    }
}
