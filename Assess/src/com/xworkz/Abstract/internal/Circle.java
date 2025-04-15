package com.xworkz.Abstract.internal;

   public class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double getArea() {
            return Math.PI * radius * radius;
        }
    }

