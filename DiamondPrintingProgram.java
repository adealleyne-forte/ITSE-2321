/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diamondprintingprogram;

/**
 *
 * @author ade_f
 */

//Name: Ade Alleyne-Forte

//Course: ITSE 2321_Practice

//Program Status: Complete

// Description: This app uses a series of for loops to create a diamond shape pattern


public class DiamondPrintingProgram {

    public static void main(String[] args) {
        
        //First half of the Diamond Pattern
        
        for (int i = 1; i <= 5; i++) { // outer loop that determines the amount of rows that will run
            for (int j = 1; j <= 5-i; j++) { //first inner loop to determine the spaces as the * prints
                System.out.print(' ');
                
            }
            
            for (int k = 1; k <= 2*i-1; k++) { // loop to increase the stars by 2 as the row (i) increases
                System.out.print('*');
                
            }
            
            //Print statement to move to next line
            
            System.out.println();
            
        }
        
        //Second half of the Daimond 
        
        for (int i = 4; i >= 1; i--) { // print number of rows
            for (int j = 1; j<=5-i; j++) { //prints spaces
                System.out.print(' ');
                
            }
            
            for (int k = 1; k <=2*i-1; k++) { //print the number of stars
                System.out.print("*"); // print stars
                
            }
            
            //Print statement to move to the next line
            
            System.out.println();
        }
        
          
       
    }
}
