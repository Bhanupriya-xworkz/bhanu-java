package com.xworkz.Interface.internal;
    public interface Book {
        void open();
        void read();
        void close();

        default void readingTips() {
            System.out.println("General Tip: Read in a well-lit environment to avoid eye strain.");
        }
    }

