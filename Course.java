package com.example.ficus.medicamentcontrol;

public class Course {

    private String courseName;
    private String courseDescription;
    private int period;
    private long medicalDoze;
    private String medicalType;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getMedicalType() {
        return medicalType;
    }

    public void setMedicalType(String medicalType) {
        this.medicalType = medicalType;
    }


    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public long getMedicalDoze() {
        return medicalDoze;
    }

    public void setMedicalDoze(long medicalDoze) {
        this.medicalDoze = medicalDoze;
    }


}
