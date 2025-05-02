/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptiona;

/**
 *
 * @author ade_f
 */

//Name: Ade Alleyne-Forte

//Course: ITSE 2321_Lab11

//Program Status: Complete

// Description: The following code builds the ExceptionTest main class

// Import necessary class

//This main function is also pulling from Exception class A & B

import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Uncomment one block at a time to test different exceptions

            // Throw custom ExceptionA
            throw new ExceptionA("This is ExceptionA.");
            
            // Throw custom ExceptionB
            // throw new ExceptionB("This is ExceptionB.");
            
            // Throw NullPointerException (built-in exception)
            // throw new NullPointerException("This is a NullPointerException.");
            
            // Throw IOException (built-in exception)
            // throw new IOException("This is an IOException.");

        } catch (Exception exception) {
            // Catch any type of Exception
            System.out.println("Caught exception: " + exception.getMessage());
        }
    }
}
