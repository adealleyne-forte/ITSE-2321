/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gasmileage;

/**
 *
 * @author ade_f
 */


//4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. 
//One driver has kept track of several trips by recording the miles driven and gallons used for each tankful. 
//Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip. 
//The program should calculate and display the miles per gallon obtained for each trip and print the combined miles per gallon obtained for all trips up to this point. 
//All averaging calculations should produce floating-point results. Use class  and sentinel-controlled iteration to obtain the data from the user.


//Name: Ade Alleyne-Forte

//Course: ITSE 2321_HW4

//Program Status: Complete

// Description: The purpose of this code is to develop an app that calculates mileage and average gallons used in a trip
   

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {
        
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Initialize total miles, total gallons, and trips counter
        
        
        int totalMiles = 0; 
        int totalGallons = 0;
        int trips = 0;
        
        // Prompt user to input miles for the first trip
        
        
        System.out.println("Enter mileage here or -1 to exit: ");
        int miles = input.nextInt();
      
        // Loop until sentinel value (-1) is entered
        // Loop start
        
        
        while (miles != -1) {
            // Prompt user to input gallons for this trip
            System.out.println("Enter gallons used: ");
            int gallons = input.nextInt();
            
            // Validate that gallons is not zero to avoid division by zero
            
            
            if (gallons == 0) {
                System.out.println("Gallons used cannot be zero. Please try again.");
                continue; // Skip this iteration and prompt again for miles and gallons
            }
        
            // Calculate miles per gallon for this trip
            
            
            double mpg = (double)miles / gallons;
            System.out.printf("Average mpg for this trip: %.2f%n", mpg);
            
            // Update total miles and gallons
            
            
            totalMiles += miles;
            totalGallons += gallons;
            trips++;
            
            // Prompt user to enter mileage for the next trip
            
            
            System.out.println("Enter mileage here or -1 to exit: ");
            miles = input.nextInt();
        }
        
        // Termination phase: Display final results if valid trips were entered
        
        
        if (trips > 0) {
            double finalAverageMPG = (double)totalMiles / totalGallons;
            System.out.printf("Total miles: %d%n", totalMiles);
            System.out.printf("Total gallons: %d%n", totalGallons);
            System.out.printf("Total average combined MPG: %.2f%n", finalAverageMPG);
        } else {
            System.out.println("No valid trips were entered.");
        }
        
        // Close the scanner
        
        
        input.close();
    }
}
