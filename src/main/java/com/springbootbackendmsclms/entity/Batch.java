package com.springbootbackendmsclms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "batch")
public class Batch {
    @Id
    @Column(name = "academic_year", nullable = false)
    private String academicYear;

    @Column(name = "started_date", nullable = false)
    private Date startedDate;

    @Column(name = "no_of_students", nullable = false)
    private int noOfStudents;

    // Getters and Setters
    public String getAcademicYear() {

        return academicYear;
    }

    public void setAcademicYear(String academicYear) {

        this.academicYear = academicYear;
    }

    public Date getStartedDate() {

        return startedDate;
    }

    public void setStartedDate(Date startedDate) {

        this.startedDate = startedDate;
    }

    public int getNoOfStudents() {

        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {

        this.noOfStudents = noOfStudents;
    }
}
