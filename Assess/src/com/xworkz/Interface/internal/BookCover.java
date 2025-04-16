package com.xworkz.Interface.internal;

    public class BookCover implements Cover {

        @Override
        public void open() {
            System.out.println("Opening the book cover...");
        }

        @Override
        public void close() {
            System.out.println("Closing the book cover...");
        }

        @Override
        public void showMaterial() {
            System.out.println("Cover material: Hardbound leather.");
        }
    }

