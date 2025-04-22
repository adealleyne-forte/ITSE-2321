/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapehierarchy;

/**
 *
 * @author ade_f
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(3.0),
            new Square(4.0),
            new Triangle(5.0, 2.0),
            new Sphere(2.5),
            new Cube(3.0),
            new Tetrahedron(4.0)
        };

        for (Shape shape : shapes) {
            System.out.println(shape); // toString()

            if (shape instanceof TwoDimensionalShape shape2D) {
                System.out.printf("Area: %.2f%n", shape2D.getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape shape3D = (ThreeDimensionalShape) shape;
                System.out.printf("Surface Area: %.2f%n", shape3D.getArea());
                System.out.printf("Volume: %.2f%n", shape3D.getVolume());
            }

            System.out.println();
        }
    }
}

