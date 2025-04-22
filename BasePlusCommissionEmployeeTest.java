/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author ade_f
 */
public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        // Create a BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
            "John", "Smith", "987-65-4321", 8000.0, 0.3, 2000.0
        );

        // Print the BasePlusCommissionEmployee details
        System.out.println("Base Plus Commission Employee Details:");
        System.out.println(employee);

        // Test the earnings method
        System.out.println("Earnings: $" + employee.earnings());

        // Update base salary, gross sales, and commission rate
        employee.setBaseSalary(2500.0);
        employee.setGross(9000.0);
        employee.setCommissionRate(0.12);

        // Print updated details and earnings
        System.out.println("\nUpdated Employee Details:");
        System.out.println(employee);
        System.out.println("Updated Earnings: $" + employee.earnings());
    }
}