package com.springbootbackendmsclms.entity;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "lectures_time_table")
public class LectureTimetable {

    @Id
    @Column(name = "lecture_id", nullable = false)
    private int lectureId;

    @Column(name = "course_code", nullable = false)
    private String courseCode;

    @Column(name = "lecturer", nullable = false)
    private String lecturer;

    @Enumerated(EnumType.STRING)
    @Column(name = "lecture_day", nullable = false)
    private LectureDay lectureDay;

    @Column(name = "lecture_time", nullable = false)
    private LocalTime lectureTime;

    @Column(name = "lecture_venue")
    private String lectureVenue;

    public enum LectureDay {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    }
    // Getters and Setters
    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public LectureDay getLectureDay() {
        return lectureDay;
    }

    public void setLectureDay(LectureDay lectureDay) {
        this.lectureDay = lectureDay;
    }

    public LocalTime getLectureTime() {
        return lectureTime;
    }

    public void setLectureTime(LocalTime lectureTime) {
        this.lectureTime = lectureTime;
    }

    public String getLectureVenue() {
        return lectureVenue;
    }

    public void setLectureVenue(String lectureVenue) {
        this.lectureVenue = lectureVenue;
    }
}
