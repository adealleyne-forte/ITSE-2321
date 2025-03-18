/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rectangle;

/**
 *
 * @author ade_f
 */

//Name: Ade Alleyne-Forte

//Course: ITSE 2321_RectangleProject

//Program Status: Complete

// Description: This is test app displays the main function to test the rectangle class, 

import java.util.Scanner;


public class RectangleTest {
      public static void main(String[] args) {
          
          //Import Reader
          
          Scanner input = new Scanner(System.in);
          
          //Prompt user to enter the length
          
          System.out.println("Please enter the length of the rectangle: ");
          double length = input.nextDouble();
          
          //Prompt to enter the width of the rectangle
          System.out.println("Please enter the width of the rectangle: ");
          double width = input.nextDouble();
          
          //Create new rectangle object
          
          Rectangle rect = new Rectangle(length, width);
          
          //Output Area and preimeter of rectangle
       
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        
        //Close Scanner
        
        input.close();
        
        
      }     
        
}


