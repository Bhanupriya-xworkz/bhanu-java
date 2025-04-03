package com.xworkz.inheretence.internal;

    public class HeavyMetal extends Metal {
        public void HM()
        {
            System.out.println("no-args const of heavy metal");
        }

        {
            super.create();
            System.out.println("heavy metal is being created");
        }

        {
            super.melt();
            System.out.println("heavy metal is being melted at high temperatures");
        }

        {
            super.forge();
            System.out.println("heavy metal is being forged for construction purposes");
        }

        {
            super.shape();
            System.out.println("heavy metal is being shaped into large structures");
        }

        public void useInConstruction()
        {
            System.out.println("heavy metal is used in construction and machinery");
        }

        public void useInTransportation()
        {
            System.out.println("heavy metal is used in the manufacturing of vehicles");
        }
    }

