package com.xworkz.method.internal;

    public class Store extends Wearable {

        public void exclusiveOffer() {
            System.out.println("Store has exclusive SportsShoe offers!");
        }

        public void Dbc(Wearable wearable) {
            wearable.wear();
            wearable.wash();
            wearable.dry();
            wearable.pack();
            wearable.display();

            if (wearable instanceof Store) {
                Store store = (Store) wearable;
                System.out.println("Wearable is an instance of Store.");
                store.exclusiveOffer();
            }
        }
    }

