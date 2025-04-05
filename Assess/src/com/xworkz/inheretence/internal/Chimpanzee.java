package com.xworkz.inheretence.internal;

    public class Chimpanzee extends Monkey {
        public void chimpanzeeInfo() {
            System.out.println("This is a chimpanzee, one of the closest relatives to humans.");
        }

        {
            super.habitat();
            System.out.println("Chimpanzees are typically found in forests and woodlands of West and Central Africa.");
        }

        {
            super.diet();
            System.out.println("Chimpanzees also consume meat, especially hunting in groups.");
        }

        {
            super.behavior();
            System.out.println("Chimpanzees are known for their complex social structures and use of tools.");
        }

        {
            super.communication();
            System.out.println("Chimpanzees communicate with a variety of vocalizations, gestures, and facial expressions.");
        }
    }
