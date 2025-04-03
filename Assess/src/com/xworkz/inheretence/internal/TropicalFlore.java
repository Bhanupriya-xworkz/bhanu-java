package com.xworkz.inheretence.internal;

    public class TropicalFlore extends Flore {
        public void TF()
        {
            System.out.println("no-args const of tropical flore");
        }

        {
            super.grow();
            System.out.println("tropical flore is growing in warm climates");
        }

        {
            super.bloom();
            System.out.println("tropical flore is blooming with exotic flowers");
        }

        {
            super.wither();
            System.out.println("tropical flore is wilting due to extreme heat");
        }

        {
            super.reproduce();
            System.out.println("tropical flore is reproducing with vibrant seeds");
        }

        public void waterNeeds()
        {
            System.out.println("tropical flore requires abundant water to thrive");
        }

        public void sunlightNeeds()
        {
            System.out.println("tropical flore thrives in full sunlight");
        }
    }

