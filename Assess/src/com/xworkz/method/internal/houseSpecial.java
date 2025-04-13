package com.xworkz.method.internal;

    public class Bakery extends Snack {

        public void houseSpecial() {
            System.out.println("Bakery's house special cookies are now available!");
        }

        public void Dbc(Snack snack) {
            snack.bake();
            snack.serve();
            snack.pack();
            snack.eat();
            snack.display();

            if (snack instanceof Bakery) {
                Bakery bakery = (Bakery) snack;
                System.out.println("Snack is an instance of Bakery.");
                bakery.houseSpecial();
            }
        }
    }

