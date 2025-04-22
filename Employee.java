/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

/**
 *
 * @author ade_f
 */


//Name: Ade Alleyne-Forte

//Course: ITSE 2321_Lab9

//Program Status: Complete

// Description: This establishes the general attributes of an employee superclass
                // Contains general information for all employees include standard information such as first name, last name
                //ssn

public class Employee {
    String firstName;
    String lastName;
    String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final void setSocialSecurityNumber(String socialSecurityNumber){

        this.socialSecurityNumber = socialSecurityNumber;
    }


    @Override
    public String toString(){

        return String.format("%s: %s%n%s: %s%n%s: %s%n", "first name", getFirstName(), "last name", getLastName(), "social security number", getSocialSecurityNumber());

    }
}