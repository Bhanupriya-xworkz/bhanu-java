package com.xworkz.method.internal;
    public class Icecream extends Cold {
        public Icecream () {
            System.out.println("Icecream Instance created.");
        }

        @Override
        public void freeze() {
            System.out.println("Icecream is frozen.");
        }

        @Override
        public void scoop () {
            System.out.println("Icecream is scooped.");

        }
        @Override
        public void melt() {
            System.out.println("Icecream is melting.");
        }

        @Override
        public void flavorMix() {
            System.out.println("Icecream is Mixing flavors.");
        }
        @Override
        public void eat() {
            System.out.println("Icecream is being eaten.");
        }
        public void Dbc() {
            System.out.println("the runner of Dbc");
        }

}
