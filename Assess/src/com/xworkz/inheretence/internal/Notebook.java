package com.xworkz.inheretence.internal;

    public class Notebook extends Paper {
        public Notebook() {
            super();
            System.out.println("Constructor of Notebook");

            write();
            tear();
            fold();
            crumple();
            burn();
        }


        public void write() {
            System.out.println("Writing in the notebook");
        }

        public void tear() {
            System.out.println("Tearing a page from the notebook");
        }

        public void fold() {
            System.out.println("Folding a page of the notebook");
        }

        public void crumple() {
            System.out.println("Crumpling a page of the notebook");
        }

        public void burn() {
            System.out.println("Burning the notebook");
        }
    }

