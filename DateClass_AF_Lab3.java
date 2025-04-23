/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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

// Description: Constructing a Date class that would print the date as an integer


public class Date {

    private int month; // instance variable
    private int day; // instance variable
    private int year; // instance variable
    
    // Date constructor that receives three parameters

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    // Getter methods to access instance variables

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // Setter methods to modify instance variables

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Print DisplayDate method

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}

