/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circledimensions;

/**
 *
 * @author ade_f
 */
//Name: Ade Alleyne-Forte

//Course: ITSE 2321

//Program Status: Complete

//Description: This application calculates and outputs the area, diameter, and circumference of a circle.
//The program prompts the user to input the radius, and based on the input, it automatically calculates the circle's dimensions.

import java.util.Scanner; //import user class Scanner

public class CircleDimensions {

//main method begins execution of java
    public static void main(String[] args) {
        // create Scanner to obtain user input
        Scanner input = new Scanner(System.in);
        
        //Value of Pi is equal to the pre-defined constant of Math.PI
        
        //Prompt user input for Radius
        System.out.print("Enter the radius value: ");
        int radius = input.nextInt();
        
        //Print the diameter, circumference and area formaated as floating points
        System.out.printf("Diameter: %.2f%n", radius* 2.0);
        System.out.printf("Circumference: %.2f%n", 2.0*Math.PI*radius);
        System.out.printf("Area: %.2f%n", 2.0*Math.PI*radius*radius);
               
        //Close Scanner
        input.close();
        
    }
}
