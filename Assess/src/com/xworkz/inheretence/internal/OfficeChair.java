package com.xworkz.inheretence.internal;

    public class OfficeChair extends Chair {
        public void OC() {
            System.out.println("no-args constructor of OfficeChair");
        }

        {
            super.adjustHeight();
            System.out.println("adjust the height of the office chair");
        }

        {
            super.recline();
            System.out.println("recline the office chair");
        }

        {
            super.swivel();
            System.out.println("swivel the office chair");
        }

        {
            super.armrests();
            System.out.println("adjust the armrests of the office chair");
        }

        {
            super.move();
            System.out.println("move the office chair");
        }
    }

