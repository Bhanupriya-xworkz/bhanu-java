package com.xworkz.Twointerface.Internal;

    public class English implements Language, Country {

        @Override
        public void speak() {
            System.out.println("Speaking in English.");
        }

        @Override
        public void alphabetType() {
            System.out.println("Alphabet: Latin script");
        }

        @Override
        public void getCountryName() {
            System.out.println("Country: United Kingdom");
        }

        @Override
        public void getContinent() {
            System.out.println("Continent: Europe");
        }
    }

public class Spanish implements Language, Country {

    @Override
    public void speak() {
        System.out.println("Speaking in Spanish.");
    }

    @Override
    public void alphabetType() {
        System.out.println("Alphabet: Latin script");
    }

    @Override
    public void getCountryName() {
        System.out.println("Country: Spain");
    }

    @Override
    public void getContinent() {
        System.out.println("Continent: Europe");
    }
}

