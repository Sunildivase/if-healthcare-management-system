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

            }
            if(option == 3){

            }
            if(option == 4){

            }
            if(option == 5){

            }
            if(option == 6){

            }
            if(option == 7){

            }
            if(option == 8){

            }

        }
        while(option != 0);
    }
    private CustomerOrPatient createCustomerOrPatient(){

        System.out.println("please enter id");
        int id = Integer.parseInt(scanner.nextLine());

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
        customerOrPatient.setId(id);
        customerOrPatient.setfName(fName);
        customerOrPatient.setlName(lName);
        customerOrPatient.setAge(age);
        customerOrPatient.setGender(gender);
        customerOrPatient.setMobile(mobile);
        customerOrPatient.setAlternateMobile(alternateMobile);
        customerOrPatient.setAddress(address);
        return customerOrPatient;
    }

    private void createHospital(){

    }
    private void createDoctor(){

    }
    private void createDepartment(){

    }
    private void createAppointment(){

    }
    private void createAllocation(){

    }
    private void createPrescription(){

    }
    private void createBilling(){


    }
}
