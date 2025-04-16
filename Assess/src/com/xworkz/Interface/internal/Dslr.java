package com.xworkz.Interface.internal;

    public class Dslr implements Camera {
        @Override
        public void focus() {
            System.out.println("Dslr executing: focus");
        }

        @Override
        public void clickPhoto() {
            System.out.println("Dslr executing: clickPhoto");
        }

        @Override
        public void preview() {
            System.out.println("Dslr executing: preview");
        }
    }

