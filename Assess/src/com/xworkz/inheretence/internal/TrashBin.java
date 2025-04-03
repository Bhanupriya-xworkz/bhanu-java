package com.xworkz.inheretence.internal;

    public class TrashBin extends Dustbin {
        public void TB()
        {
            System.out.println("no-args const of trash bin");
        }

        {
            super.open();
            System.out.println("trash bin is opened to dispose waste");
        }

        {
            super.close();
            System.out.println("trash bin is closed after waste disposal");
        }

        {
            super.clean();
            System.out.println("trash bin is being cleaned after emptying");
        }

        {
            super.empty();
            System.out.println("trash bin is emptied and ready for use");
        }

        public void separateWaste()
        {
            System.out.println("separating biodegradable and non-biodegradable waste");
        }

        public void deodorize()
        {
            System.out.println("deodorizing the trash bin to prevent odor");
        }
    }

