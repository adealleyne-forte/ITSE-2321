/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringregionmatch;

/**
 *
 * @author ade_f
 */

//Name: Ade Alleyne-Forte

//Course: ITSE 2321_HW14

//Program Status: Complete

// Description: This app accepts a user input for some strings and test whether or not they ar of the same length

//14.4 (Comparing Portions of String) Write an application that uses String method region-matches to compare two strings input by the user. 
//The application should input the number of characters to be compared and the starting index of the comparison. 
//The application should state whether the compared characters are equal. 
//Ignore the case of the characters when performing the comparison.
                


import java.util.Scanner;

public class StringRegionMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Input number of characters to compare and starting index
        System.out.print("Enter the number of characters to compare: ");
        int length = scanner.nextInt();

        System.out.print("Enter the starting index for comparison: ");
        int startIndex = scanner.nextInt();

        // Perform region comparison (case-insensitive)
        boolean matches = str1.regionMatches(true, startIndex, str2, startIndex, length);

        // Output result
        if (matches) {
            System.out.println("The specified regions of the two strings are equal.");
        } else {
            System.out.println("The specified regions of the two strings are not equal.");
        }

        scanner.close();
    }
}