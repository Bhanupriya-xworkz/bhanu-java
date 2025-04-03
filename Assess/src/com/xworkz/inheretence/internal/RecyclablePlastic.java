package com.xworkz.inheretence.internal;

    public class RecyclablePlastic extends Plastic {
        public void RP()
        {
            System.out.println("no-args const of recyclable plastic");
        }

        {
            super.manufacture();
            System.out.println("recyclable plastic is being manufactured");
        }

        {
            super.use();
            System.out.println("recyclable plastic is being used");
        }

        {
            super.dispose();
            System.out.println("recyclable plastic is being disposed");
        }

        {
            super.pollute();
            System.out.println("recyclable plastic is polluting less");
        }
    }

