package com.xworkz.inheretence.external;

    public class RunningShoes extends Shoes {
        public void RS() {
            System.out.println("no-args constructor of RunningShoes");
        }

        {
            super.laceUp();
            System.out.println("tie the laces of running shoes");
        }

        {
            super.slipOn();
            System.out.println("slip on the running shoes");
        }

        {
            super.waterproof();
            System.out.println("make running shoes waterproof");
        }

        {
            super.comfortMode();
            System.out.println("activate comfort mode in running shoes");
        }

        {
            super.sportMode();
            System.out.println("activate sport mode in running shoes");
        }
    }

