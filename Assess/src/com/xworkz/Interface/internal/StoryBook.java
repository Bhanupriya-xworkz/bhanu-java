package com.xworkz.Interface.internal;

    public class StoryBook implements Book {

        @Override
        public void open() {
            System.out.println("Opening the storybook...");
        }

        @Override
        public void read() {
            System.out.println("Reading a magical fairy tale...");
        }

        @Override
        public void close() {
            System.out.println("Closing the storybook. The end!");
        }
    }

