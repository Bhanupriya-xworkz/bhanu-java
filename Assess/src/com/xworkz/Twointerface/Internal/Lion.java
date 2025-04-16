package com.xworkz.Twointerface.Internal;

    public class Lion implements Animal, Habitat {

        @Override
        public void getName() {
            System.out.println("Animal: Lion");
        }

        @Override
        public void makeSound() {
            System.out.println("Sound: Roar");
        }

        @Override
        public void getHabitatType() {
            System.out.println("Habitat: Grasslands and Savannas");
        }

        @Override
        public void getRegion() {
            System.out.println("Region: Africa");
        }
    }

public class Penguin implements Animal, Habitat {

    @Override
    public void getName() {
        System.out.println("Animal: Penguin");
    }

    @Override
    public void makeSound() {
        System.out.println("Sound: Honk");
    }

    @Override
    public void getHabitatType() {
        System.out.println("Habitat: Coastal and Cold Regions");
    }

    @Override
    public void getRegion() {
        System.out.println("Region: Antarctica");
    }
}

