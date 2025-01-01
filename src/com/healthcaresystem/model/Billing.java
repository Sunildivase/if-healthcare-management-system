package com.healthcaresystem.model;

public class Billing {

    private int billId;
    private int appointmentId;
    private int bill;
    private int totalBill;

    @Override
    public String toString() {
        return "BillingDetails{" +
                "billId=" + billId +
                ", appointmentId=" + appointmentId +
                ", bill=" + bill +
                ", totalBill=" + totalBill +
                '}';
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
}
