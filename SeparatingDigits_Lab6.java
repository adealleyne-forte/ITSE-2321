/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.separatingdigits;

/**
 *
 * @author ade_f
 */

import java.util.Scanner;
        
public class SeparatingDigits {
    
    //Method to calculate the quotient
    
    public static int calculateQuotient(int num1, int num2) {
        return num1/num2;
    }
    
    //Method to calcualte the remainder
    public static int calculateRemainder(int num1, int num2) {
        return num1%num2;
    }
    
    //Method to ensure quotient is between 1 and 99999
    
    public static void displayDigits(int number) {
        if (number < 1 || number >99999) {
            System.out.println("Error: This value is invalid, number should be greater than 1 and less than 99999");       
            return;
        } 
        
        //Extract digits from the quotient and remainder
        
        int divisor = 1;
        
        //Finding the highest divisor to exrtract the first digit
        
        while(number / divisor >=10) {
        divisor *=10;
        }
        
        //Loop through each digit
        
        while (divisor > 0) {
        int digit = number / divisor;
        System.out.print(digit + " ");
        number %= divisor; // Remove digit from the number
        divisor /=10; //
        }
            System.out.println();
              
    }
    
    //Create the main method
    
    public static void main (String [] args) {
        
        //Read scanner
        
        Scanner input = new Scanner(System.in);
        
        //Prompt user to enter first value
        
        System.out.println("Please enter the first integer value: ");
        int num1 = input.nextInt();
        
        //Prompt user to enter second value
        System.out.println("Please enter the first integer value: ");
        int num2 = input.nextInt();
        
        //Ensure that the denominator and numerator is not equal to zero
        
        if (num1 ==0 || num2 == 0) {
            System.out.println("Error: Numerator or Denominator cannot equal zero");
            return;
        
            
        }
        
        //Calculate quotient and remainder
        int quotient = calculateQuotient(num1,num2);
        int remainder= calculateRemainder(num1,num2);
        
        //Print statement
        System.out.println("The quotient value is: " + quotient);
        System.out.println("The remainder value is: " + remainder);
        
        //Display the separated digits on the quotient
        System.out.println("The separated quotient value is: ");
        displayDigits(quotient);
    
    }
}
