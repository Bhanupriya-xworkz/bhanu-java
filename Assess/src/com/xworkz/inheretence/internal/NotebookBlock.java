package com.xworkz.inheretence.internal;

    public class NotebookBlock extends Block {
        public NotebookBlock() {
            super();
            System.out.println("Constructor of NotebookBlock");

            breakBlock();
            stackBlock();
            arrangeBlock();
            paintBlock();
            cleanBlock();
        }

        public void breakBlock() {
            System.out.println("Breaking the notebook block");
        }

        public void stackBlock() {
            System.out.println("Stacking the notebook block");
        }

        public void arrangeBlock() {
            System.out.println("Arranging the notebook block");
        }

        public void paintBlock() {
            System.out.println("Painting the notebook block");
        }

        public void cleanBlock() {
            System.out.println("Cleaning the notebook block");
        }
    }

