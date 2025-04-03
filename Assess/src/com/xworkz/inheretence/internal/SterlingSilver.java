package com.xworkz.inheretence.internal;

    public class SterlingSilver extends Silver {
        public void SS()
        {
            System.out.println("no-args const of sterling silver");
        }

        {
            super.mine();
            System.out.println("sterling silver is being mined");
        }

        {
            super.refine();
            System.out.println("sterling silver is being refined");
        }

        {
            super.useInJewelry();
            System.out.println("sterling silver is used in fine jewelry");
        }

        {
            super.store();
            System.out.println("sterling silver is stored in secure storage");
        }
    }

