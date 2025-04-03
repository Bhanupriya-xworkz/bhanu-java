package com.xworkz.inheretence.internal;

    public class TemperedGlass extends Glass {
        public void TG()
        {
            System.out.println("no-args const of tempered glass");
        }

        {
            super.melt();
            System.out.println("tempered glass is being melted at high temperatures");
        }

        {
            super.shape();
            System.out.println("tempered glass is being shaped with precision");
        }

        {
            super.cool();
            System.out.println("tempered glass is cooling down under controlled conditions");
        }

        {
            super.polish();
            System.out.println("tempered glass is being polished for smoothness");
        }

        public void increaseStrength()
        {
            System.out.println("tempered glass is being treated to increase strength");
        }

        public void useInConstruction()
        {
            System.out.println("tempered glass is used in construction, especially for windows and facades");
        }
    }

