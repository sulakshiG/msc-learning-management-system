package com.springbootbackendmsclms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "course_code", nullable = false)
    private String courseCode;

    @Column(name = "course_name", nullable = false)
    private String courseName;

    @Column(name = "course_instructor_id")
    private String courseInstructorId;

    @Column(name = "course_credit")
    private BigDecimal courseCredit;

    @Column(name = "passing_grade")
    private String passingGrade;

    @Column(name = "academic_year", nullable = false)
    private String academicYear;

    @Column(name = "prerequisites")
    private String prerequisites;

    @Enumerated(EnumType.STRING)
    @Column(name = "course_type")
    private CourseType courseType;

    // Getters and Setters
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseInstructorId() {
        return courseInstructorId;
    }

    public void setCourseInstructorId(String courseInstructorId) {
        this.courseInstructorId = courseInstructorId;
    }

    public BigDecimal getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(BigDecimal courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getPassingGrade() {
        return passingGrade;
    }

    public void setPassingGrade(String passingGrade) {
        this.passingGrade = passingGrade;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public enum CourseType {
        OPTIONAL, CORE, FOUNDATION
    }
}
