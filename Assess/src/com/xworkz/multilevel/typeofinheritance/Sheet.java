package com.xworkz.multilevel.typeofinheritance;

    public class Sheet {
        public void material() {
            System.out.println("This is a general sheet material.");
        }
    }

    class PaperSheet extends Sheet {
        public void size() {
            System.out.println("Paper sheet is A4 size.");
        }
    }


    public class Main {
        public static void main(String[] args) {
            ExamSheet examSheet = new ExamSheet();
            examSheet.material();
            examSheet.size();
        }
    }
