/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystemmodification;

/**
 *
 * @author ade_f
 */


//Name: Ade Alleyne-Forte

//Course: ITSE 2321_HW10

//Program Status: Complete

// Description: This app builds the employee class with the midification of the employee birthdate added


import java.time.LocalDate;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final LocalDate birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }
    public LocalDate getBirthDate() { return birthDate; }

    @Override
    public String toString() {
        return String.format(
            "%s %s%nsocial security number: %s%nbirth date: %s",
            getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
    }

    public abstract double earnings();
}
