package com.xworkz.inheretence.internal;

public class Threads {
        public void T()
        {
            System.out.println("no-args const of thread");
        }

        public void start()
        {
            System.out.println("thread is starting");
        }

        public void run()
        {
            System.out.println("thread is running");
        }

        public void stop()
        {
            System.out.println("thread is stopping");
        }

        public void sleep(int millis)
        {
            System.out.println("thread is sleeping for " + millis + " milliseconds");
        }
    }

