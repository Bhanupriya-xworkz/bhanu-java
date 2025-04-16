package com.xworkz.Interface.internal;

    public class GoldRing implements Gold {

        @Override
        public void melt() {
            System.out.println("Melting the gold to create new jewelry...");
        }

        @Override
        public void polish() {
            System.out.println("Polishing the gold ring to a shiny finish.");
        }

        @Override
        public void checkPurity() {
            System.out.println("Gold purity: 24 Karat.");
        }
    }

