package com.rayana.controller;

import com.rayana.model.Course;
import com.rayana.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository repository;

    @GetMapping
    public List<Course> list() {
        return repository.findAll();
    }
}
