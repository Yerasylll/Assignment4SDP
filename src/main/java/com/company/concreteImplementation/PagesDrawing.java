package com.company.concreteImplementation;

import com.company.implementation.IDrawingExecutor;

public class PagesDrawing implements IDrawingExecutor {
    @Override
    public void drawCircle(int radius) {
        System.out.print("Drawing Circle on Pages with radius: " + radius);
    }

    @Override
    public void drawSquare(int side) {
        System.out.print("Drawing Square on Pages with side length: " + side);
    }

    @Override
    public void drawTriangle(int base, int height) {
        System.out.print("Drawing Triangle on Pages with base: " + base + " and height: " + height);
    }
}
