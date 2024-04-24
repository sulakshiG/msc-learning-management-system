package com.springbootbackendmsclms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "student_index", nullable = false)
    private String studentIndex;

    @Column(name = "student_registration_no", nullable = true)
    private String studentRegistrationNo;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "contact_no", nullable = false)
    private String contactNo;

    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "academic_year", nullable = false)
    private String academicYear;

    @Column(name = "name", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name= "gender", nullable = false)
    private Gender gender;

    // Getters and Setters
    public String getStudentIndex() {

        return studentIndex;
    }

    public void setStudentIndex(String studentIndex) {

        this.studentIndex = studentIndex;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getStudentRegistrationNo() {

        return studentRegistrationNo;
    }

    public void setStudentRegistrationNo(String studentRegistrationNo) {

        this.studentRegistrationNo = studentRegistrationNo;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getContactNo() {

        return contactNo;
    }

    public void setContactNo(String contactNo) {

        this.contactNo = contactNo;
    }

    public Date getDateOfBirth() {

        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {

        this.dateOfBirth = dateOfBirth;
    }

    public String getAcademicYear() {

        return academicYear;
    }

    public void setAcademicYear(String academicYear) {

        this.academicYear = academicYear;
    }

    public Gender getGender() {

        return gender;
    }

    public void setGender(Gender gender) {

        this.gender = gender;
    }

    public enum Gender {
        male, female;
    }
}
