/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapehierarchy;

/**
 *
 * @author ade_f
 */

//Name: Ade Alleyne-Forte

//Course: ITSE 2321_Lab10

//Program Status: Complete

// Description: Cube subclass of the Three Dimensional Class 


public class Cube extends ThreeDimensionalShape {
    private final double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return String.format("%s with side %.2f", super.toString(), side);
    }
}

