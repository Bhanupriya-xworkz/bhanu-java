package com.xworkz.inheretence.internal;

    public class VenomousPoison extends Poison {
        public void VP()
        {
            System.out.println("no-args const of venomous poison");
        }

        {
            super.affect();
            System.out.println("venomous poison is affecting");
        }

        {
            super.neutralize();
            System.out.println("venomous poison is neutralized");
        }

        {
            super.spread();
            System.out.println("venomous poison is spreading");
        }

        {
            super.antidote();
            System.out.println("antidote for venomous poison is administered");
        }
    }

