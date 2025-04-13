package com.xworkz.method.external;

import com.xworkz.method.external.ElectricCar;
import com.xworkz.method.internal.Car;

    public class CarRunner {
        public static void main(String[] args) {

            Car car1 = new Car();
            car1.start();
            car1.stop();
            car1.accelerate();
            car1.brake();
            car1.honk();
            car1.fuel();

            System.out.println("=============");

            ElectricCar electricCar = new ElectricCar();
            electricCar.start();
            electricCar.stop();
            electricCar.accelerate();
            electricCar.brake();
            electricCar.honk();
            electricCar.fuel();
        }
    }

