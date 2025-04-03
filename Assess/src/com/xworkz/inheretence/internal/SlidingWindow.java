package com.xworkz.inheretence.internal;

    public class SlidingWindow extends Window {
        public void SW()
        {
            System.out.println("no-args const of sliding window");
        }

        {
            super.open();
            System.out.println("sliding window is being opened");
        }

        {
            super.close();
            System.out.println("sliding window is being closed");
        }

        {
            super.lock();
            System.out.println("sliding window is being locked");
        }

        {
            super.unlock();
            System.out.println("sliding window is being unlocked");
        }
    }

