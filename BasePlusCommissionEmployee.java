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

// Description: Commisssion Employee subclass which extends the Employee superclass and establishes employees
                //being paid on commission


public class BasePlusCommissionEmployee extends CommissionEmployee {
    private final double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, java.time.LocalDate birthDate,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, birthDate, grossSales, commissionRate);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("base-salaried %s;base salary: $%.2f", super.toString(), getBaseSalary());
    }
}
