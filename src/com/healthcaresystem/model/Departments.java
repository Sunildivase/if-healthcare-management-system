package com.healthcaresystem.model;

public class Departments {

    private int deptId;
    private String deptName;
    private int hospitalId;
    private int doctorId;

    @Override
    public String toString() {
        return "Departments{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", hospitalId=" + hospitalId +
                ", doctorId=" + doctorId +
                '}';
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
}
