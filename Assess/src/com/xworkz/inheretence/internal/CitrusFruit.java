package com.xworkz.inheretence.internal;

    public class CitrusFruit extends Fruit {
        public void CF()
        {
            System.out.println("no-args const of citrus fruit");
        }

        {
            super.grow();
            System.out.println("citrus fruit is growing");
        }

        {
            super.ripen();
            System.out.println("citrus fruit is ripening");
        }

        {
            super.harvest();
            System.out.println("citrus fruit is harvested");
        }

        {
            super.eat();
            System.out.println("citrus fruit is being eaten");
        }
    }

