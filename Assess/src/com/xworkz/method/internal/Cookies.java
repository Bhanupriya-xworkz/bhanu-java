package com.xworkz.method.internal;

    public class Cookies extends Snack {

        public Cookies() {
            System.out.println("Cookies instance created.");
        }

        @Override
        public void bake() {
            System.out.println("Cookies are baked to perfection.");
        }

        @Override
        public void serve() {
            System.out.println("Cookies are served warm.");
        }

        @Override
        public void pack() {
            System.out.println("Cookies are packed in a cookie box.");
        }

        @Override
        public void eat() {
            System.out.println("Cookies are being eaten with milk.");
        }

        @Override
        public void display() {
            System.out.println("Cookies are displayed in the bakery.");
        }

        public void cookieSpecial() {
            System.out.println("These cookies have a surprise chocolate center!");
        }
    }

