package com.xworkz.Interface.external.Mainrunner;
import com.xworkz.Interface.internal.Circle;
import com.xworkz.Interface.internal.Shape;

public class HomeMain {

        public static void main(String[] args) {
            Shape circle1 = new Circle(5.0);
            Shape circle2 = new Circle(7.5);
            Shape circle3 = new Circle(10.0);

            circle1.draw();
            circle1.calculateArea();
            circle1.calculatePerimeter();

            circle2.draw();
            circle2.calculateArea();
            circle2.calculatePerimeter();

            circle3.draw();
            circle3.calculateArea();
            circle3.calculatePerimeter();
        }
    }

