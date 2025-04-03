package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Flower;
import com.xworkz.inheretence.internal.Rose;

public class FlowerRunner {
        public static void main(String[] args) {
            // Creating an object of Rose (which is a subclass of Flower)
            Flower flower = new Rose();
            Flower basicFlower = new Flower();

            // Using basic flower operations
            basicFlower.bloom();
            basicFlower.wither();
            basicFlower.fragrance();
            basicFlower.color();

            // Using Rose operations
            Rose rose = new Rose();
            rose.thorns();
            rose.petals();
            rose.bloom();
        }
    }

