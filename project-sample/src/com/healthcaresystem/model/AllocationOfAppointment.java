package com.healthcaresystem.model;

public class AllocationOfAppointment {

    private int allId;
    private int patientId;
    private int doctorId;

    @Override
    public String toString() {
        return "AllocationOfAppointment{" +
                "allId=" + allId +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                '}';
    }

    public int getAllId() {
        return allId;
    }

    public void setAllId(int allId) {
        this.allId = allId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
}
