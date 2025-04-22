/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author ade_f
 */

//Name: Ade Alleyne-Forte

//Course: ITSE 2321_Lab9

//Program Status: Complete

// Description: This app for the updated commission employee class
                // App shoudl display the udpated employee name and data
                


public class CommissionEmployeeTest {
    public static void main(String[] args) {
        // Create a CommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee(
            "Jane", "Doe", "123-45-6789", 10000.0, 0.3
        );

        // Print the CommissionEmployee details
        System.out.println("Commission Employee Details:");
        System.out.println(employee);

        // Test the earnings method
        System.out.println("Earnings: $" + employee.earnings());

        // Update gross sales and commission rate
        employee.setGross(12000.0);
        employee.setCommissionRate(0.15);

        // Print updated details and earnings
        System.out.println("\nUpdated Employee Details:");
        System.out.println(employee);
        System.out.println("Updated Earnings: $" + employee.earnings());
    }
}
