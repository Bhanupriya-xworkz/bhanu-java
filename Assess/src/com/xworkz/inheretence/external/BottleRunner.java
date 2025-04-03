package com.xworkz.inheretence.external;

public class BottleRunner {
        public static void main(String[] args) {

            Bottle smartBottle = new SmartBottle();

            Bottle traditionalBottle = new Bottle();

            smartBottle.fillWater();
            smartBottle.drinkWater();
            smartBottle.trackWaterIntake();
            smartBottle.sendReminder();
            smartBottle.syncWithApp();

            traditionalBottle.fillWater();
            traditionalBottle.checkCapacity();
        }
    }
