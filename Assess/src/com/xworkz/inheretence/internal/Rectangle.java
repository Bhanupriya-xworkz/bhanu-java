package com.xworkz.inheretence.internal;

    public class Rectangle extends Shape {

        private double length;
        private double width;

        public Rectangle(double length, double width) {
            super();  // Calling the parent class constructor
            this.length = length;
            this.width = width;
            System.out.println("No-args constructor of Rectangle");

            draw();
            resize();
            calculateArea();
            calculatePerimeter();
        }

        public void calculateArea() {
            double area = length * width;
            System.out.println("Area of the rectangle: " + area);
        }

        public void calculatePerimeter() {
            double perimeter = 2 * (length + width);
            System.out.println("Perimeter of the rectangle: " + perimeter);
        }

        public void displayDimensions() {
            System.out.println("Length: " + length + ", Width: " + width);
        }
    }

