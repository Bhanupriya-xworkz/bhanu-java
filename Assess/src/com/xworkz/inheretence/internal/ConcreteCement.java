package com.xworkz.inheretence.internal;

    public class ConcreteCement extends Cement {
        public void CC()
        {
            System.out.println("no-args const of concrete cement");
        }

        {
            super.mix();
            System.out.println("mixing concrete cement for stronger bond");
        }

        {
            super.set();
            System.out.println("concrete cement is setting in place");
        }

        {
            super.dry();
            System.out.println("concrete cement is drying and becoming solid");
        }

        {
            super.harden();
            System.out.println("concrete cement is hardening for durability");
        }

        public void pour()
        {
            System.out.println("pouring concrete cement into molds");
        }

        public void reinforce()
        {
            System.out.println("reinforcing concrete cement with steel bars for strength");
        }
    }

