package com.springbootbackendmsclms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "exam_time_table")
public class ExamTimetable {

    @Id
    @Column(name = "exam_id", nullable = false)
    private String examId;

    @Column(name = "exam_date", nullable = false)
    private Date examDate;

    @Column(name = "exam_time", nullable = false)
    private Time examTime;

    @Column(name = "course", nullable = false)
    private String course;

    @Column(name = "exam_semester", nullable = false)
    private String examSemester;

    @Column(name = "academic_year")
    private String academicYear;

    @Column(name = "exam_name")
    private String examName;

    @Column(name = "exam_invigilator_id")
    private String examInvigilatorId;

    // Getters and Setters
    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public Time getExamTime() {
        return examTime;
    }

    public void setExamTime(Time examTime) {
        this.examTime = examTime;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getExamSemester() {
        return examSemester;
    }

    public void setExamSemester(String examSemester) {
        this.examSemester = examSemester;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamInvigilatorId() {
        return examInvigilatorId;
    }

    public void setExamInvigilatorId(String examInvigilatorId) {
        this.examInvigilatorId = examInvigilatorId;
    }

}
