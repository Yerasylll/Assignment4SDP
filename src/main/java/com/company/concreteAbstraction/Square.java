package com.company.concreteAbstraction;

import com.company.abstraction.Shape;
import com.company.implementation.IDrawingExecutor;

public class Square extends Shape {
    private int side;

    public Square(int side, IDrawingExecutor drawingImplementor) {
        super(drawingImplementor);
        this.side = side;
    }

    @Override
    public void draw() {
        drawingImplementor.drawSquare(side);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

