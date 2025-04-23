/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circledimensions;

/**
 *
 * @author ade_f
 */

//2.28 (Diameter, Circumference and Area of a Circle) Here’s a peek ahead. 
//In this chapter, you learned about integers and the type . 
//Java can also represent floating-point numbers that contain decimal points, such as 3.14159. 
//Write an application that inputs from the user the radius of a circle as an integer and prints the circle’s diameter, circumference and area using the floating-point value 3.14159 for π. 
//Use the techniques shown in Fig. 2.7. [Note: You may also use the predefined constant for the value of π. This constant is more precise than the value 3.14159.
//Class is defined in package . Classes in that package are imported automatically, so you do not need to import class to use it.] 
//Use the following formulas (r is the radius): Do not store the results of each calculation in a variable. Rather, specify each calculation as the value that will be output in a statement. The values produced by the circumference and area calculations are floating-point numbers. 
//Such values can be output with the format specifier in a statement. You’ll learn more about floating-point numbers in Chapter 3.


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
