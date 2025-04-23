/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromechecker;

/**
 *
 * @author ade_f
 */

//4.21 (Find the Largest Number) The process of finding the largest value is used frequently in computer applications. 
//For example, a program that determines the winner of a sales contest would input the number of units sold by each salesperson. 
//The salesperson who sells the most units wins the contest. 
//Write a pseudocode program, then a Java application that inputs a series of 10 integers and determines and prints the largest integer. 
//Your program should use at least the following three variables: 
//: A counter to count to 10 (i.e., to keep track of how many numbers have been input and to determine when all 10 numbers have been processed). 
//: The integer most recently input by the user. : The largest number found so far.

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        
        //Scanner reader
        Scanner input = new Scanner(System.in);
        
        //Store instance variable
        int number;
        
        //Print Prompt for user to enter 5 digit integers
        System.out.println("Please enter 5 digit integer: ");
        number = input.nextInt();
        
        //Error code: Error code 1 means that there was an invalid integer entry
        //user must enter a 5 digit number 
        //Integer checker
        if (number < 10000 || number >99999) {
            System.out.println("Not a valid entry. Entry must be 5 digits...restart program...");
            System.exit(1);
            
        }
        
        else {
            //Check if number is a Palindrome
            
            //Store instance variables
            int originalNumber = number;
            
            //Initialze reversed number
            int reversedNumber = 0;
        
            
        while (number != 0) {
        int lastDigit = number % 10;
        reversedNumber = reversedNumber * 10 + lastDigit;
        number = number / 10;
                
                }
        
        //Compare original and reversed to check if it is a palindrome
            if (originalNumber == reversedNumber) {
                System.out.println(originalNumber +  "is a palindrome");
                
            } else {
                System.out.println(originalNumber + "is not a palindrome");
            }
            
        }
        
        //Close Scanner
        
        input.close();
            
        }
    }

