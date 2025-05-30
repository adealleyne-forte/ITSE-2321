/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.point;

/**
 *
 * @author ade_f
 */

//Name: Ade Alleyne-Forte

//Course: ITSE 2321_HW9

//Program Status: Complete

// Description: This code establishes the Rectangle subclass


public class Rectangle extends Quadrilateral {

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double area() {
        double length = Math.abs(p1.getX() - p2.getX());
        double width = Math.abs(p2.getY() - p3.getY());
        return length * width;
    }
}