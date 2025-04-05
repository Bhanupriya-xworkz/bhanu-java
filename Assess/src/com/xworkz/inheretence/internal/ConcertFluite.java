package com.xworkz.inheretence.internal;

    public class ConcertFliute extends Fluite {
        public void concertFluteInfo() {
            System.out.println("This is a concert flute, used in orchestras and classical music performances.");
        }

        {
            super.material();
            System.out.println("Concert flutes are typically made of silver, gold, or platinum.");
        }

        {
            super.range();
            System.out.println("Concert flutes have a broad range, typically 3 to 4 octaves.");
        }

        {
            super.sound();
            System.out.println("The concert flute produces a clear, bright tone that is ideal for orchestral music.");
        }

        {
            super.history();
            System.out.println("The concert flute has evolved over time and is central to orchestral and solo performances.");
        }
    }

