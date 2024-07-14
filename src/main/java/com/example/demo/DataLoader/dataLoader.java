package com.example.demo.DataLoader;

import com.example.demo.schools.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;

@Component
public class dataLoader implements CommandLineRunner {

    @Autowired
    private SchoolService schoolService;

    @Override
    public void run(String... args) throws Exception {

        schoolService.importSchoolsFromCsv("src/main/resources/schools.csv");

        System.out.println("Schools imported successfully.");


    }
}
