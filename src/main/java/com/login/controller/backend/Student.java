package com.login.controller.backend;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    String email;
    @Column
    LocalDate loginDate = LocalDate.now();
    @Column
    String fName;
    @Column
    String lName;
    @Column
    String course;


    public Student(){

    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
