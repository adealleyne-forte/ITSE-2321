/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

/**
 *
 * @author ade_f
 */

//Name: Ade Alleyne-Forte

//Course: ITSE 2321_RectangleProject

//Program Status: Complete

// Description: This is app displays the build for the rectangle class, it defines the methods to calculate the Area and Perimeter
                //of a rectangle.


public class Rectangle {
    
    //Instance variables
    
    private double length;
    private double width;
    
    //No argument constructors here
    
    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
    
}
    //Set parameters for the class
    
    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Sides cannot have negative value");
            
        }
        this.length = length;
        this.width = width;
    }
    
    //getter and setter methods
    
    private double getLength(){
        return length;
    }
    
    private void setLength(double length){
        this.length = length;
    }
    
    private double getWidth(){
        return width;
    }
    
    private void setWidth(double width){
        this.width = width;
    }
    
    //Method to calculate Area
    
    private double calculateArea(){
        return length * width;
        
    }
    
    //Method to calculate Perimeter
    
    private double calculatePerimeter(){
        return 2*(length * width);
     
    }
    
    //public method to get area as string
    
    public String getArea(){
        return "The Area of the rectangle is: " + calculateArea();
    }
    
    //public method to get Perimeter as string
    
    public String getPerimeter(){
        return "The Perimeter of the rectangle is: " + calculatePerimeter();
    }
}