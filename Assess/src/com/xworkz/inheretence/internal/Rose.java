package com.xworkz.inheretence.internal;

    public class Rose extends Flower {
        public void R() {
            System.out.println("no-args const of rose");
        }

        {
            super.bloom();
            System.out.println("rose is blooming with beautiful petals");
        }

        {
            super.wither();
            System.out.println("rose is wilting after a few days");
        }

        {
            super.fragrance();
            System.out.println("rose has a sweet fragrance");
        }

        {
            super.color();
            System.out.println("rose has red, pink, or yellow vibrant colors");
        }

        public void thorns() {
            System.out.println("rose has thorns on its stem");
        }

        public void petals() {
            System.out.println("rose has delicate, soft petals");
        }
    }

