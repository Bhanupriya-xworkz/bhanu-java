package com.xworkz.inheretence.internal;

    public class BaseballCap extends Cap {
        public void BC()
        {
            System.out.println("no-args const of baseball cap");
        }

        {
            super.wear();
            System.out.println("baseball cap is being worn");
        }

        {
            super.remove();
            System.out.println("baseball cap is being removed");
        }

        {
            super.adjustFit();
            System.out.println("adjusting the fit of baseball cap");
        }

        {
            super.store();
            System.out.println("baseball cap is stored in a locker");
        }
    }

