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

// Description: Tetrahedron subclass of the Three Dimensional Class 

public class Tetrahedron extends ThreeDimensionalShape {
    private final double edge;

    public Tetrahedron(double edge) {
        super("Tetrahedron");
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * edge * edge;
    }

    @Override
    public double getVolume() {
        return (Math.pow(edge, 3)) / (6 * Math.sqrt(2));
    }

    @Override
    public String toString() {
        return String.format("%s with edge %.2f", super.toString(), edge);
    }
}

