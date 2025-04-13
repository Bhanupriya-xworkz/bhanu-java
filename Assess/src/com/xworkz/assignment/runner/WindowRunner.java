package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.veriable.Window;

public class WindowRunner {
        public static void main(String[] args) {
            Window w = new Window();
            System.out.println(w);
            System.out.println(new Window().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(w));

            Window window1 = new Window();
            window1.setTransparent(true);
            Window window2 = new Window();
            window2.setTransparent(false);
            boolean same = window1.equals(window2);
            System.out.println("both same: " + same);
        }
    }

