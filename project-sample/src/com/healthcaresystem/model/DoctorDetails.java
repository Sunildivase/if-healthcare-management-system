package com.healthcaresystem.model;

public class DoctorDetails {

    private int doctorId;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public String toString() {
        return "DoctorDetails{" +
                "doctorId=" + doctorId +
                '}';
    }
}
