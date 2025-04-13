package com.xworkz.method.internal;

    public class ProgrammingLanguage extends Language {

        public ProgrammingLanguage() {
            System.out.println("ProgrammingLanguage instance created.");
        }

        @Override
        public void speak() {
            System.out.println("ProgrammingLanguage is compiled.");
        }

        @Override
        public void write() {
            System.out.println("ProgrammingLanguage is written in IDE.");
        }

        @Override
        public void read() {
            System.out.println("ProgrammingLanguage is read by the compiler.");
        }

        @Override
        public void translate() {
            System.out.println("ProgrammingLanguage is translated to machine code.");
        }

        @Override
        public void learn() {
            System.out.println("ProgrammingLanguage is being learned by developers.");
        }

        public void debug() {
            System.out.println("ProgrammingLanguage is being debugged.");
        }
    }

