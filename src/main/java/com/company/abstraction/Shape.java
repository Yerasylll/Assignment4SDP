package com.company.abstraction;

import com.company.implementation.IDrawingExecutor;

public abstract class Shape {
    protected IDrawingExecutor drawingImplementor;

    public Shape(IDrawingExecutor drawingImplementor) {
        this.drawingImplementor = drawingImplementor;
    }

    public abstract void draw();

    public abstract double calculateArea();
}
