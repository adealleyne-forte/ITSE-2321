/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parkingcharges;

/**
 *
 * @author ade_f
 */


//Name: Ade Alleyne-Forte

//Course: ITSE 2321_Practice

//Program Status: Complete

// Description: This app uses a series of for loops to create a diamond shape pattern

import java.util.Scanner;

public class ParkingCharges {

    // Instance variables for the class
    private float parkingTime; // Total parking time (in hours)
    private double baseFee; // Base charge for parking

    // Constructor
    public ParkingCharges(float parkingTime) {
        this.parkingTime = parkingTime; // Initialize parking time (in hours)
        this.baseFee = 2.0; // Initialize base fee of $2
    }

    // Method for calculating parking charges
    public void calculateCharges() {
        double totalCharge = baseFee;  // Start with the base fee

        // If parking time is greater than 3 hours, apply additional charges
        if (parkingTime > 3) {
            totalCharge += (parkingTime - 3) * 0.5;  // Additional charge for hours beyond 3
        }

        // Print statement
        System.out.println("Total fee for parking " + parkingTime + " hours is $" + totalCharge);
    }

    // Getter and Setter methods for parkingTime
    public float getParkingTime() {
        return parkingTime;
    }

    public void setParkingTime(float parkingTime) {
        this.parkingTime = parkingTime;
    }

    // Main method to test the parking charges class
    public static void main(String[] args) {

        // Create a scanner to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt user to enter parking time
        System.out.println("Please enter total number of hours parked: ");
        float parkingTimeInput = input.nextFloat();

        // Create an instance of ParkingCharges using the user input
        ParkingCharges parking = new ParkingCharges(parkingTimeInput);

        // Calculate charges
        parking.calculateCharges();

        // Prompt user to enter new parking time
        System.out.println("Please enter new total number of hours parked: ");
        float newParkingTime = input.nextFloat();
        parking.setParkingTime(newParkingTime);

        // Recalculate charges
        parking.calculateCharges();

        // Close the scanner
        input.close();
    }
}
