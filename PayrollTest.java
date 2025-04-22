/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystemmodification;

/**
 *
 * @author ade_f
 */
import java.time.LocalDate;

public class PayrollTest {
    public static void main(String[] args) {
        // Create LocalDate instances for birth dates
        LocalDate today = LocalDate.now();
        
        // Create employee objects
        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("Alice", "Johnson", "111-11-1111",
                LocalDate.of(1990, 4, 5), 1000.00);

        employees[1] = new HourlyEmployee("Bob", "Smith", "222-22-2222",
                LocalDate.of(1985, 3, 12), 20.00, 42);

        employees[2] = new CommissionEmployee("Charlie", "Brown", "333-33-3333",
                LocalDate.of(1975, 4, 10), 10000, 0.06);

        employees[3] = new BasePlusCommissionEmployee("Diana", "Prince", "444-44-4444",
                LocalDate.of(1988, 12, 25), 5000, 0.04, 300);

        System.out.printf("Payroll processed on: %s%n%n", today);

        // Process each employee polymorphically
        for (Employee emp : employees) {
            System.out.println(emp); 

            double baseEarnings = emp.earnings();
            // Add birthday bonus if it's the employee's birth month
            boolean birthdayMonth = emp.getBirthDate().getMonth() == today.getMonth();
            double totalEarnings = birthdayMonth ? baseEarnings + 100.0 : baseEarnings;

            if (birthdayMonth) {
                System.out.println("Birthday bonus applied: +$100.00");
            }

            System.out.printf("earned: $%.2f%n%n", totalEarnings);
        }
    }
}
