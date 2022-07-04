package com.in28minutes.learnspringboot.courses.controller;

import com.in28minutes.learnspringboot.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(new Course(1,"Course1", "Author1"),new Course(2,"Course2", "Author2"));
    }

    @GetMapping("/courses/1")
    public Course getOneCourse(){
        return new Course(1,"course Name", "Author1");
    }
}
