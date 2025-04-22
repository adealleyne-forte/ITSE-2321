/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.point;

/**
 *
 * @author ade_f
 */
public class Main {
    public static void main(String[] args) {
        // Create Points for the shapes
        Point p1 = new Point(7, 9);  
        Point p2 = new Point(4, 0);  
        Point p3 = new Point(4, 3); 
        Point p4 = new Point(0, 3);  

        // Create and calculate area of Rectangle
        Quadrilateral rectangle = new Rectangle(p1, p2, p3, p4);
        System.out.println("Rectangle area: " + rectangle.area());

        // Create and calculate area of Parallelogram
        Quadrilateral parallelogram = new Parallelogram(p1, p2, p4, new Point(2, 3));  // New point for p4 of parallelogram
        System.out.println("Parallelogram area: " + parallelogram.area());

        // Create and calculate area of Trapezoid
        Quadrilateral trapezoid = new Trapezoid(p1, p2, new Point(5, 3), new Point(1, 3));  // Adjusted points for trapezoid
        System.out.println("Trapezoid area: " + trapezoid.area());

        // Create and calculate area of Square
        Point p5 = new Point(0, 0);  // Point (0,0)
        Point p6 = new Point(5, 0);  // Point (5,0)
        Point p7 = new Point(5, 5);  // Point (5,5)
        Point p8 = new Point(0, 5);  // Point (0,5)
        Quadrilateral square = new Square(p5, p6, p7, p8);
        System.out.println("Square area: " + square.area());
    }
}

