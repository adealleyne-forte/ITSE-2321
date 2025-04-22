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

public class CommissionEmployee extends Employee {
    private final double grossSales;
    private final double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn, java.time.LocalDate birthDate, double grossSales, double commissionRate) {
        super(firstName, lastName, ssn, birthDate);
        if (grossSales < 0.0 || commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Invalid sales or commission rate");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString() {
        return String.format("commission employee: %s%ngross sales: $%.2f; commission rate: %.2f", super.toString(), getGrossSales(), getCommissionRate());
    }
}

