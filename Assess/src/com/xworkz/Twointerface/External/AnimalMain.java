package com.xworkz.Twointerface.External;

import com.xworkz.Interface.internal.Animal;
import com.xworkz.Twointerface.Internal.Lion;

public class AnimalMain {

        public static void main(String[] args) {
            Animal animal1 = new Lion();
            Animal animal2 = new Penguin();

            animal1.getName();
            animal2.makeSound();

            Habitat habitat1 = new Lion();
            Habitat habitat2 = new Penguin();

            habitat1.getHabitatType();
            habitat2.getRegion();
        }
    }

