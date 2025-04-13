package com.xworkz.method.external;

public class SportsShoesRunner {
    public static void main(String[] args) {
        SportsShoes shoes = new SportsShoes();
        shoes.wear();
        shoes.wash();
        shoes.dry();
        shoes.pack();
        shoes.display();
        shoes.runnerSpecial();

        System.out.println("=====================");

        Wearable wearable = new Wearable();
        wearable.wear();
        wearable.wash();
        wearable.dry();
        wearable.pack();
        wearable.display();

        System.out.println("=================");

        Store store = new Store();
        store.Dbc(wearable);
        store.Dbc(store);
    }
}

