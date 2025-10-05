package com.company.concreteAbstraction;

import com.company.abstraction.Shape;
import com.company.implementation.IDrawingExecutor;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height, IDrawingExecutor drawingImplementor) {
        super(drawingImplementor);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        drawingImplementor.drawTriangle(base, height);
    }

    @Override
    public double calculateArea() {
        return base* height * 0.5;
    }
}
