package com.example.demo.schools;


import jakarta.persistence.*;

@Entity
@Table(name = "Schools")
public class Schools {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   // Assuming 'id' is the primary key. Change it accordingly.

    private String name;
    private String village;
    private String mobile;
    private String division;
    private String district;
    private String thana;


    public Schools() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getThana() {
        return thana;
    }

    public void setThana(String thana) {
        this.thana = thana;
    }

    public Schools(String name,String village,String mobile,String division, String district, String thana) {
        this.division = division;
        this.mobile = mobile;
        this.village = village;
        this.name = name;

        this.district = district;
        this.thana = thana;
    }
    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", village='" + village + '\'' +
                ", mobile='" + mobile + '\'' +
                ", division='" + division + '\'' +
                ", district='" + district + '\'' +
                ", thana='" + thana + '\'' +
                '}';
    }



}
