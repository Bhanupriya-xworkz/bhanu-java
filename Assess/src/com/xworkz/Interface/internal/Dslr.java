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
    @Override
    public void cameraTips() {
        System.out.println("Dslr Tip: Use manual mode for better control over exposure and focus.");
    }

