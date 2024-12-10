package com.healthcaresystem.model;

public class HospitalDetails {

    private int hospitalID;
    private String hName;
    private String contactNo;
    private String hAddress;
    private String emailId;



    @Override
    public String toString() {
        return "HospitalDetails{" +
                "hospitalID=" + hospitalID +
                ", hName='" + hName + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", hAddress='" + hAddress + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public int getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String gethAddress() {
        return hAddress;
    }

    public void sethAddress(String hAddress) {
        this.hAddress = hAddress;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}
