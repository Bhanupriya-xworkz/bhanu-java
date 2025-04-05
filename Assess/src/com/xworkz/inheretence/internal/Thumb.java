package com.xworkz.inheretence.internal;

    public class Thumb extends Finger {
        public void thumbInfo() {
            System.out.println("This is a thumb, a special finger used for grasping");
        }

        {
            super.bend();
            System.out.println("Thumb bends");
        }

        {
            super.extend();
            System.out.println("Thumb extends");
        }

        {
            super.grasp();
            System.out.println("Thumb helps in grasping objects");
        }

        {
            super.touch();
            System.out.println("Thumb helps in touch and grip");
        }
    }

