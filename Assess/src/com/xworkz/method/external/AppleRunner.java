package com.xworkz.method.external;

import com.xworkz.method.internal.Apple;
import com.xworkz.method.internal.GreenApple;

    public class AppleRunner {
        public static void main(String[] args) {
            // Testing the Apple class
            Apple apple1 = new Apple();
            apple1.grow();
            apple1.ripen();
            apple1.pluck();
            apple1.eat();
            apple1.juice();
            apple1.store();

            System.out.println("=============");

            // Testing the GreenApple class
            GreenApple greenApple = new GreenApple();
            greenApple.grow();
            greenApple.ripen();
            greenApple.pluck();
            greenApple.eat();
            greenApple.juice();
            greenApple.store();

            System.out.println("=============");

            // Testing the RedApple class
            RedApple redApple = new RedApple();
            redApple.grow();
            redApple.ripen();
            redApple.pluck();
            redApple.eat();
            redApple.juice();
            redApple.store();
        }
    }

