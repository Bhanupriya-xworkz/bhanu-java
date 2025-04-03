package com.xworkz.inheretence.internal;

    public class PureGold extends Gold {
        public void PG()
        {
            System.out.println("no-args const of pure gold");
        }

        {
            super.mine();
            System.out.println("pure gold is being mined");
        }

        {
            super.refine();
            System.out.println("pure gold is being refined");
        }

        {
            super.useInJewelry();
            System.out.println("pure gold is used in high-end jewelry");
        }

        {
            super.store();
            System.out.println("pure gold is stored in secure vaults");
        }
    }

