package com.xworkz.inheretence.internal;

    public class RubberChock extends Chock {
        public void RC()
        {
            System.out.println("no-args const of rubber chock");
        }

        {
            super.secure();
            System.out.println("rubber chock is securing the vehicle with high grip");
        }

        {
            super.release();
            System.out.println("rubber chock is releasing the vehicle safely");
        }

        {
            super.adjust();
            System.out.println("rubber chock is being adjusted for better stability");
        }

        {
            super.inspect();
            System.out.println("rubber chock is being inspected for wear and tear");
        }

        public void preventSlippage()
        {
            System.out.println("rubber chock prevents slippage of the vehicle");
        }

        public void increaseGrip()
        {
            System.out.println("rubber chock is increasing the grip on the vehicle tires");
        }
    }

