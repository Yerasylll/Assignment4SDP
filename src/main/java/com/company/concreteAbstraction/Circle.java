package com.company.concreteAbstraction;

import com.company.abstraction.Shape;
import com.company.implementation.IDrawingExecutor;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, IDrawingExecutor drawingImplementor) {
        super(drawingImplementor);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingImplementor.drawCircle(radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


