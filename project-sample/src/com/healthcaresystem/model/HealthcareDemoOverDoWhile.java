package com.healthcaresystem.model;

import java.util.Scanner;

public class HealthcareDemoOverDoWhile {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HealthcareDemoOverDoWhile healthcareDemoOverDoWhile = new HealthcareDemoOverDoWhile();

        int option = 0;
        do{
            
            System.out.println("*** Healthcare Management System ***");
            System.out.println("please choose the option");
            System.out.println("1. Create customer");
            System.out.println("2. Create hospital");
            System.out.println("3. Create doctors");
            System.out.println("4. Create departments");
            System.out.println("5. Create appointment details");
            System.out.println("6. Create allocation of appointment");
            System.out.println("7. Create prescription details");
            System.out.println("8. Create billing details");
            System.out.println("0. Exit project");
            option = Integer.parseInt(scanner.nextLine());

            if(option == 1){
                CustomerOrPatient customerOrPatient   =healthcareDemoOverDoWhile.createCustomerOrPatient();
                System.out.println("customer or patient created: "+customerOrPatient);
            }
            if(option == 2){
             HospitalDetails hospitalDetails = healthcareDemoOverDoWhile.createHospital();
                System.out.println("hospital details created: "+hospitalDetails);
            }
            if(option == 3){
              DoctorDetails doctorDetails = healthcareDemoOverDoWhile.createDoctor();
                System.out.println("doctors details created: "+doctorDetails);
            }
            if(option == 4){
              Departments departments = healthcareDemoOverDoWhile.createDepartment();
                System.out.println("department details created: "+departments);
            }
            if(option == 5){
             AppointmentDetails appointmentDetails = healthcareDemoOverDoWhile.createAppointment();
                System.out.println("appointment details created: "+appointmentDetails);
            }
            if(option == 6){
                AllocationOfAppointment allocationOfAppointment = healthcareDemoOverDoWhile.createAllocation();
                System.out.println("allocation od appointment created "+allocationOfAppointment);
            }
            if(option == 7){
               PrescriptionDetails prescriptionDetails = healthcareDemoOverDoWhile.createPrescription();
                System.out.println("prescription created "+prescriptionDetails);
            }
            if(option == 8){
           BillingDetails billingDetails = healthcareDemoOverDoWhile.createBilling();
                System.out.println("bill created "+billingDetails);
            }

        }
        while(option != 0);
    }
    private CustomerOrPatient createCustomerOrPatient(){

        System.out.println("please enter id");
        int patientId = Integer.parseInt(scanner.nextLine());

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

        CustomerOrPatient customerOrPatient = new CustomerOrPatient();
        customerOrPatient.setPatientId(patientId);
        customerOrPatient.setfName(fName);
        customerOrPatient.setlName(lName);
        customerOrPatient.setAge(age);
        customerOrPatient.setGender(gender);
        customerOrPatient.setMobile(mobile);
        customerOrPatient.setAlternateMobile(alternateMobile);
        customerOrPatient.setAddress(address);
        return customerOrPatient;
    }

    private HospitalDetails createHospital(){

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

        HospitalDetails hospitalDetails = new HospitalDetails();
        hospitalDetails.setHospitalID(hospitalId);
        hospitalDetails.sethName(hName);
        hospitalDetails.setContactNo(contactNo);
        hospitalDetails.sethAddress(hAddress);
        hospitalDetails.setEmailId(emailId);
        return hospitalDetails;

    }
    private DoctorDetails createDoctor(){

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

        DoctorDetails doctorDetails = new DoctorDetails();
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
    private AppointmentDetails createAppointment(){
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

        AppointmentDetails appointmentDetails = new AppointmentDetails();
        appointmentDetails.setAppointmentId(appointmentId);
        appointmentDetails.setPatientId(patientId);
        appointmentDetails.setDoctorId(doctorId);
        appointmentDetails.setHospitalId(hospitalId);
        appointmentDetails.setDeptId(deptId);
        return appointmentDetails;
    }
    private AllocationOfAppointment createAllocation(){

        System.out.println("enter allocation id ");
        int allId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter patient id ");
        int patientId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter doctor id ");
        int doctorId = Integer.parseInt(scanner.nextLine());

        AllocationOfAppointment allocationOfAppointment = new AllocationOfAppointment();
        allocationOfAppointment.setAllId(allId);
        allocationOfAppointment.setPatientId(patientId);
        allocationOfAppointment.setDoctorId(doctorId);
        return allocationOfAppointment;

    }
    private PrescriptionDetails createPrescription(){

        System.out.println("enter prescription id ");
        int pId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter patient id ");
        int patientId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter prescription details ");
        String prescriptionDetail = scanner.nextLine();

        PrescriptionDetails prescriptionDetails = new PrescriptionDetails();
        prescriptionDetails.setpId(pId);
        prescriptionDetails.setPatientId(patientId);
        prescriptionDetails.setPrescriptionDetail(prescriptionDetail);
        return prescriptionDetails;

    }
    private BillingDetails createBilling(){
        System.out.println("enter bill id ");
        int billId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter appointment id ");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("enter bill");
        int bill = Integer.parseInt(scanner.nextLine());

        System.out.println("enter total bill ");
        int totalBill = Integer.parseInt(scanner.nextLine());

        BillingDetails billingDetails = new BillingDetails();
        billingDetails.setBillId(billId);
        billingDetails.setAppointmentId(appointmentId);
        billingDetails.setBill(bill);
        billingDetails.setTotalBill(totalBill);
        return billingDetails;


    }
}
