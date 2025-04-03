package com.xworkz.inheretence.internal;

    public class RunnableThread extends Thread implements Runnable {
        public void RT()
        {
            System.out.println("no-args const of runnable thread");
        }

        {
            super.start();
            System.out.println("RunnableThread has started");
        }

        {
            super.run();
            System.out.println("RunnableThread is running");
        }

        {
            super.stop();
            System.out.println("RunnableThread has stopped");
        }

        {
            super.sleep(2000);  // Sleep for 2000 milliseconds
            System.out.println("RunnableThread has slept for 2 seconds");
        }

        @Override
        public void run() {
            System.out.println("Running in the overridden run method of RunnableThread");
        }
    }

