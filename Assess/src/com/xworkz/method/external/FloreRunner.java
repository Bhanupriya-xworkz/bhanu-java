package com.xworkz.method.external;

import com.xworkz.inheretence.internal.Flore;
import com.xworkz.inheretence.internal.Flower;

public class FloreRunner {
        public static void main(String[] args) {
            Flower flower1 = new Flower();
            flower1.bloom();
            flower1.wilt();
            flower1.grow();
            flower1.smell();
            flower1.shedPetals();

            System.out.println("=============");

            FlowerBot flowerBot = new FlowerBot();
            flowerBot.bloom();
            flowerBot.wilt();
            flowerBot.grow();
            flowerBot.smell();
            flowerBot.shedPetals();
        }
    }
