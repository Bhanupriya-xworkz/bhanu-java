package com.xworkz.inheretence.internal;

    public class Backpack extends Bag {
        public void BP() {
            System.out.println("no-args constructor of Backpack");
        }

        {
            super.openMainCompartment();
            System.out.println("open the main compartment of the backpack");
        }

        {
            super.closeMainCompartment();
            System.out.println("close the main compartment of the backpack");
        }

        {
            super.addItem();
            System.out.println("add item to the backpack");
        }

        {
            super.removeItem();
            System.out.println("remove item from the backpack");
        }

        {
            super.carry();
            System.out.println("carry the backpack");
        }
    }

