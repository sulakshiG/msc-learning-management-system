package com.springbootbackendmsclms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "non_academic_staff")
public class NonAcademicStaff {

    @Id
    @Column(name = "staff_id", nullable = false)
    private String staffId;

    @Column(name = "over_time_hours")
    private Integer overTimeHours;

    @Column(name = "over_time_hour_rate")
    private Integer overTimeHourRate;

    @Column(name = "designation")
    private String designation;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public Integer getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(Integer overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public Integer getOverTimeHourRate() {
        return overTimeHourRate;
    }

    public void setOverTimeHourRate(Integer overTimeHourRate) {
        this.overTimeHourRate = overTimeHourRate;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}