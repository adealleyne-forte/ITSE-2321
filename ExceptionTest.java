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

//Course: ITSE 2321_HW11

//Program Status: Complete

// Description: The following code builds the ExceptionTest subclass


// Demonstration class to test the exception hierarchy
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            // Uncomment one of the following lines to test different exceptions
            throw new ExceptionB("This is ExceptionB.");
            // throw new ExceptionC("This is ExceptionC.");
        } catch (ExceptionA e) {
            // Catch the superclass exception
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}