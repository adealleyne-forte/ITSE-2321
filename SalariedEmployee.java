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

// Description: Salaried Employee subclass which extends the Employee superclass and establishes employees
                //being paid a weekly salary



public class SalariedEmployee extends Employee {
    private final double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, java.time.LocalDate birthDate, double weeklySalary) {
        super(firstName, lastName, ssn, birthDate);
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s%nweekly salary: $%.2f", super.toString(), getWeeklySalary());
    }
}
