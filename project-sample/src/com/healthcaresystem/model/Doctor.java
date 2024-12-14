package com.healthcaresystem.model;

public class Doctor {

    private int doctorId;
    private String doctorFName;
    private String doctorLName;
    private String gender;
    private int age;
    private String contactNo;
    private String speciality;

    @Override
    public String toString() {
        return "DoctorDetails{" +
                "doctorId=" + doctorId +
                ", doctorFName='" + doctorFName + '\'' +
                ", doctorLName='" + doctorLName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", contactNo='" + contactNo + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorFName() {
        return doctorFName;
    }

    public void setDoctorFName(String doctorFName) {
        this.doctorFName = doctorFName;
    }

    public String getDoctorLName() {
        return doctorLName;
    }

    public void setDoctorLName(String doctorLName) {
        this.doctorLName = doctorLName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
