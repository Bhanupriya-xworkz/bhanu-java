package com.xworkz.inheretence.internal;

    public class FountainPen extends Pen {
        public void FP()
        {
            System.out.println("no-args const of fountain pen");
        }

        {
            super.write();
            System.out.println("fountain pen is writing with smooth ink flow");
        }

        {
            super.refill();
            System.out.println("fountain pen is being refilled with ink");
        }

        {
            super.cap();
            System.out.println("fountain pen is being capped to prevent ink spillage");
        }

        {
            super.uncapped();
            System.out.println("fountain pen is uncapped for writing");
        }

        public void adjustNib()
        {
            System.out.println("fountain pen nib is being adjusted for writing style");
        }

        public void clean()
        {
            System.out.println("fountain pen is being cleaned after use");
        }
    }

