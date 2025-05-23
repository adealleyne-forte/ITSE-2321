/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.date;

/**
 *
 * @author ade_f
 */

//3.14 ( Class) Create a class called that includes three instance variables—a month (type ), a day (type ) and a year (type ). 
//Provide a constructor that initializes the three instance variables and assumes that the values provided are correct. 
//Provide a set and a get method for each instance variable. Provide a method that displays the month, day and year separated by forward slashes (). 
//Write a test app named that demonstrates class ’s capabilities.



//Name: Ade Alleyne-Forte

//Course: ITSE 2321_Lab3

//Program Status: Complete

// Description: This app test the date class that was built
   

public class DateTest {
    
    public static void main(String[] args) {
        
        //Call the Date constructor

        Date birth_Date = new Date (10, 11, 1988); //mm/dd/yyyy
        
        //Display the date

        System.out.println("My birthday is:");

        birth_Date.displayDate();

	// Test the getter methods

	System.out.println("/nUsing the getter methods: ");
	System.out.println("Month: ", + birth_Date.getMonth());
	System.out.println("Day: ", + birth_Date.getDay());
	System.out.println("Year: ", + birth_Date.getYear());

	//Test the setter methods
	
	birth_Date.setMonth(06); //changed month
	birth_Date.setDay(25); 	//changed day
	birth_Date.setYear(1990); //changed year

	//Display the new date
	
	System.out.println("/nModified Birthday using setter methods: ");
	birth_Date.displayDate();

	
        
    }
    
}
