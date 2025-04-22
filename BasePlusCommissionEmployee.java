/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author ade_f
 */
public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last, String ssn, double gross, double commissionRate, double baseSalary){
        super(first, last, ssn, gross, commissionRate);
        setBaseSalary(baseSalary);
    }


    public double getBaseSalary(){return this.baseSalary;}
    public final void setBaseSalary(double baseSalary){
        if(baseSalary < 0)
            throw new IllegalArgumentException("Base salary cannot be negative!");
        else
            this.baseSalary = baseSalary;}

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString(){
        return String.format("%s%s: %f%n", super.toString(), "base salary", getBaseSalary());
    }

}