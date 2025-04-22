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

// Description: Hourly Employee subclass which extends the Employee superclass and establishes employees
                //being paid a hourly salary


public class HourlyEmployee extends Employee {
    private final double wage; // wage per hour
    private final double hours; // hours worked for the week

    public HourlyEmployee(String firstName, String lastName, String ssn, java.time.LocalDate birthDate, double wage, double hours) {
        super(firstName, lastName, ssn, birthDate);
        if (wage < 0.0 || hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Invalid wage or hours");
        }
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double earnings() {
        return (hours <= 40) ? wage * hours : (40 * wage + (hours - 40) * wage * 1.5);
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%nhourly wage: $%.2f; hours worked: %.2f", super.toString(), getWage(), getHours());
    }
}
