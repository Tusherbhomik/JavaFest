package com.example.demo.schools;

import com.example.demo.schools.Schools;
import com.example.demo.schools.SchoolRepository;
import com.example.demo.schools.Schools;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    public List<Schools> getAllSchools() {
       List<Schools> schools = schoolRepository.findAll();
        return schools;
    }

    public void importSchoolsFromCsv(String filePath) {
        // Update with your actual path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Skip the header line
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(","); // Split by comma
                if (values.length == 6) {
                    Schools school = new Schools();
                    school.setName(values[0]);
                    school.setVillage(values[1]);
                    school.setMobile(values[2]);
                    school.setDivision(values[3]);
                    school.setDistrict(values[4]);
                    school.setThana(values[5]);

                    // Save to the database
                    schoolRepository.save(school);
                }
            }
            System.out.println("Schools imported successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
