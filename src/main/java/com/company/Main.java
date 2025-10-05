package com.company;

import com.company.abstraction.Shape;
import com.company.concreteAbstraction.Circle;
import com.company.concreteAbstraction.Square;
import com.company.concreteAbstraction.Triangle;
import com.company.concreteImplementation.PagesDrawing;
import com.company.concreteImplementation.PowerPointDrawing;
import com.company.implementation.IDrawingExecutor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IDrawingExecutor pagesDrawing = new PagesDrawing();
        IDrawingExecutor powerPointDrawing = new PowerPointDrawing();

        Shape circle = new Circle(5, pagesDrawing);
        Shape square = new Square(3, pagesDrawing);
        Shape triangle = new Triangle(3, 5, pagesDrawing);

        ArrayList<Shape> shapesOnPages = new ArrayList<>();
        shapesOnPages.add(circle);
        shapesOnPages.add(square);
        shapesOnPages.add(triangle);

        circle = new Circle(3, powerPointDrawing);
        square = new Square(5, powerPointDrawing);
        triangle = new Triangle(4, 7, powerPointDrawing);

        ArrayList<Shape> shapesOnPowerPoint = new ArrayList<>();
        shapesOnPowerPoint.add(circle);
        shapesOnPowerPoint.add(square);
        shapesOnPowerPoint.add(triangle);

        for (Shape shape : shapesOnPages) {
            shape.draw();
            System.out.print(", Area: " + shape.calculateArea());
            System.out.println();
        }
        System.out.println();
        for (Shape shape : shapesOnPowerPoint) {
            shape.draw();
            System.out.print(", Area: " + shape.calculateArea());
            System.out.println();
        }
    }
}