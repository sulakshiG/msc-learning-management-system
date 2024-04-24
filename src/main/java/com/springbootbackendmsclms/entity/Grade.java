package com.springbootbackendmsclms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "grades")
public class Grade {

    @Id
    @Column(name = "range_of_marks", nullable = false)
    private String rangeOfMarks;

    @Column(name = "grade",  nullable = false)
    private String grade;

    @Column(name = "grade_point_value", nullable = false)
    private Double gradePointValue;

    @Column(name = "implication", length = 50)
    private String implication;

    public String getRangeOfMarks() {
        return rangeOfMarks;
    }

    public void setRangeOfMarks(String rangeOfMarks) {
        this.rangeOfMarks = rangeOfMarks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Double getGradePointValue() {
        return gradePointValue;
    }

    public void setGradePointValue(Double gradePointValue) {
        this.gradePointValue = gradePointValue;
    }

    public String getImplication() {
        return implication;
    }

    public void setImplication(String implication) {
        this.implication = implication;
    }
}
