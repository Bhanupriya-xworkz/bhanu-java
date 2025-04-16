package com.xworkz.Interface.internal;

    public class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public void draw() {
            System.out.println("Drawing a circle.");
        }

        @Override
        public void calculateArea() {
            double area = Math.PI * radius * radius;
            System.out.println("Area of circle: " + area);
        }

        @Override
        public void calculatePerimeter() {
            double perimeter = 2 * Math.PI * radius;
            System.out.println("Perimeter of circle: " + perimeter);
        }
    }

