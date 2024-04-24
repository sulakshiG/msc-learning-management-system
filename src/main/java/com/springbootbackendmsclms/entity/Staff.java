package com.springbootbackendmsclms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "staff")
public class Staff {

    @Id
    @Column(name = "staff_id", length = 10, nullable = false)
    private String staffId;

    @Column(name = "staff_name", length = 50, nullable = false)
    private String staffName;

    @Column(name = "staff_email", length = 50, nullable = false, unique = true) // Consider adding unique constraint
    private String staffEmail;

    @Column(name = "staff_contact", length = 12, nullable = false)
    private String staffContact;

    @Enumerated(EnumType.STRING)
    @Column(name = "staff_type", length = 20, nullable = false)
    private StaffType staffType;

    public enum StaffType {
        ACADEMIC_STAFF,
        NON_ACADEMIC_STAFF;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getStaffContact() {
        return staffContact;
    }

    public void setStaffContact(String staffContact) {
        this.staffContact = staffContact;
    }

    public StaffType getStaffType() {
        return staffType;
    }

    public void setStaffType(StaffType staffType) {
        this.staffType = staffType;
    }
}