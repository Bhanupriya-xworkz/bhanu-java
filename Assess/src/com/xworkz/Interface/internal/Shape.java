package com.xworkz.Interface.internal;

    public interface Shape {
        void draw();
        void calculateArea();
        void calculatePerimeter();

        default void displayShape() {
            System.out.println("This is a shape.");
        }
    }

