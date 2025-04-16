package com.xworkz.Interface.internal;

    public class InkjetPrinter implements Printer {
        @Override
        public void loadPaper() {
            System.out.println("InkjetPrinter executing: loadPaper");
        }

        @Override
        public void printDocument() {
            System.out.println("InkjetPrinter executing: printDocument");
        }

        @Override
        public void ejectPaper() {
            System.out.println("InkjetPrinter executing: ejectPaper");
        }
    }

