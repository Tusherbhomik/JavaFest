package com.example.demo.schools;

import com.example.demo.schools.Schools;
import com.example.demo.schools.Schools;
import com.example.demo.schools.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("/schools")
    public List<Schools> getAllSchools() {
        return schoolService.getAllSchools();
    }
}
