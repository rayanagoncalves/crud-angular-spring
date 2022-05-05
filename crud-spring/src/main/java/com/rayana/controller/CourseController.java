package com.rayana.controller;

import com.rayana.model.Course;
import com.rayana.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        return repository.save(course);
       /* return ResponseEntity.status(HttpStatus.CREATED)
                .body(repository.save(course)); */
    }
}
