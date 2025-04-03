package com.xworkz.inheretence.internal;

    public class FishingRod extends Rod {
        public void FR()
        {
            System.out.println("no-args const of fishing rod");
        }

        {
            super.bend();
            System.out.println("fishing rod is bending under pressure");
        }

        {
            super.straighten();
            System.out.println("fishing rod is being straightened after use");
        }

        {
            super.cut();
            System.out.println("fishing rod is being cut to the desired length");
        }

        {
            super.polish();
            System.out.println("fishing rod is being polished for smoothness");
        }

        public void castLine()
        {
            System.out.println("fishing rod is casting the fishing line");
        }

        public void reelIn()
        {
            System.out.println("fishing rod is reeling in the caught fish");
        }
    }

