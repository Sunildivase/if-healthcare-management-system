package com.healthcaresystem.service;

import com.healthcaresystem.model.*;

import java.util.Scanner;

public class HealthcareDemoOverDoWhile {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HealthcareDemoOverDoWhile healthcareDemoOverDoWhile = new HealthcareDemoOverDoWhile();

        int option = 0;
        do{

            System.out.println("************ Healthcare Management System *************");
            System.out.println("please choose the option");
            System.out.println("1. Create person");
            System.out.println("2. Create hospital");
            System.out.println("3. Create doctors");
            System.out.println("4. Create departments");
            System.out.println("5. Create appointment");
            System.out.println("6. Create prescription");
            System.out.println("7. Create billing");
            System.out.println("0. Exit project");

            option = Integer.parseInt(scanner.nextLine());

            if(option == 1){
                Person customerOrPatient   =healthcareDemoOverDoWhile.createCustomerOrPatient();
                System.out.println("customer or patient created: "+customerOrPatient);
            }
            if(option == 2){
             Hospital hospitalDetails = healthcareDemoOverDoWhile.createHospital();
                System.out.println("hospital details created: "+hospitalDetails);
            }
            if(option == 3){
              Doctor doctorDetails = healthcareDemoOverDoWhile.createDoctor();
                System.out.println("doctors details created: "+doctorDetails);
            }
            if(option == 4){
              Departments departments = healthcareDemoOverDoWhile.createDepartment();
                System.out.println("department details created: "+departments);
            }
            if(option == 5){
             Appointment appointmentDetails = healthcareDemoOverDoWhile.createAppointment();
                System.out.println("appointment details created: "+appointmentDetails);
            }
            if(option == 6){
               Prescription prescriptionDetails = healthcareDemoOverDoWhile.createPrescription();
                System.out.println("prescription created "+prescriptionDetails);
            }
            if(option == 7){
           Billing billingDetails = healthcareDemoOverDoWhile.createBilling();
                System.out.println("bill created "+billingDetails);
            }

        }
        while(option != 0);{
            System.out.println("Thank you !!!");
        }

    }
    private Person createCustomerOrPatient(){

        System.out.println("please enter id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter type");
        String type = scanner.nextLine();

        System.out.println("please enter fName");
        String fName = scanner.nextLine();

        System.out.println("please enter lName");
        String lName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter mobile number");
        String mobile = scanner.nextLine();

        System.out.println("please enter alternate number");
        String alternateMobile =  scanner.nextLine();

        System.out.println("please enter address");
        String address = scanner.nextLine();

        Person customerOrPatient = new Person();
        customerOrPatient.setId(id);
        customerOrPatient.setType(type);
        customerOrPatient.setfName(fName);
        customerOrPatient.setlName(lName);
        customerOrPatient.setAge(age);
        customerOrPatient.setGender(gender);
        customerOrPatient.setMobile(mobile);
        customerOrPatient.setAlternateMobile(alternateMobile);
        customerOrPatient.setAddress(address);
        return customerOrPatient;
    }

    private Hospital createHospital(){

        System.out.println("please enter hospital id: ");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital name: ");
        String hName = scanner.nextLine();

        System.out.println("please enter hospital contactNo: ");
        String contactNo = scanner.nextLine();

        System.out.println("please enter hospital address: ");
        String hAddress = scanner.nextLine();

        System.out.println("please enter email id: ");
        String emailId = scanner.nextLine();

        Hospital hospitalDetails = new Hospital();
        hospitalDetails.setHospitalID(hospitalId);
        hospitalDetails.sethName(hName);
        hospitalDetails.setContactNo(contactNo);
        hospitalDetails.sethAddress(hAddress);
        hospitalDetails.setEmailId(emailId);
        return hospitalDetails;

    }
    private Doctor createDoctor(){

        System.out.println("please enter doctors id: ");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter doctor first name: ");
        String doctorFName = scanner.nextLine();

        System.out.println("please enter doctor last name: ");
        String doctorLName= scanner.nextLine();

        System.out.println("please enter gender: ");
        String gender = scanner.nextLine();

        System.out.println("please enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter contact number: ");
        String contactNo = scanner.nextLine();

        System.out.println("please enter speciality: ");
        String speciality = scanner.nextLine();

        Doctor doctorDetails = new Doctor();
        doctorDetails.setDoctorId(doctorId);
        doctorDetails.setDoctorFName(doctorFName);
        doctorDetails.setDoctorLName(doctorLName);
        doctorDetails.setGender(gender);
        doctorDetails.setAge(age);
        doctorDetails.setContactNo(contactNo);
        doctorDetails.setSpeciality(speciality);
        return doctorDetails;

    }
    private Departments createDepartment(){

        System.out.println("please enter department id: ");
        int deptId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter department name: ");
        String deptName = scanner.nextLine();

        System.out.println("enter hospital id: ");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter dept id ");
        int doctorId = Integer.parseInt(scanner.nextLine());

        Departments departments = new Departments();
        departments.setDeptId(deptId);
        departments.setDeptName(deptName);
        departments.setHospitalId(hospitalId);
        departments.setDoctorId(doctorId);
        return departments;
    }
    private Appointment createAppointment(){
        System.out.println("enter appointment id: ");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter patient id: ");
        int patientId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter doctor id: ");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter hospital id: ");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter dept id: ");
        int deptId = Integer.parseInt(scanner.nextLine());

        Appointment appointmentDetails = new Appointment();
        appointmentDetails.setAppointmentId(appointmentId);
        appointmentDetails.setPatientId(patientId);
        appointmentDetails.setDoctorId(doctorId);
        appointmentDetails.setHospitalId(hospitalId);
        appointmentDetails.setDeptId(deptId);
        return appointmentDetails;
    }

    private Prescription createPrescription(){

        System.out.println("enter prescription id ");
        int pId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter patient id ");
        int patientId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter prescription details ");
        String prescriptionDetail = scanner.nextLine();

        Prescription prescriptionDetails = new Prescription();
        prescriptionDetails.setpId(pId);
        prescriptionDetails.setPatientId(patientId);
        prescriptionDetails.setPrescriptionDetail(prescriptionDetail);
        return prescriptionDetails;

    }
    private Billing createBilling(){
        System.out.println("enter bill id ");
        int billId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter appointment id ");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter bill");
        int bill = Integer.parseInt(scanner.nextLine());

        System.out.println("enter total bill ");
        int totalBill = Integer.parseInt(scanner.nextLine());

        Billing billingDetails = new Billing();
        billingDetails.setBillId(billId);
        billingDetails.setAppointmentId(appointmentId);
        billingDetails.setBill(bill);
        billingDetails.setTotalBill(totalBill);
        return billingDetails;


    }
}
