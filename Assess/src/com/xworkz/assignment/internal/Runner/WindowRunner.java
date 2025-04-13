package com.xworkz.assignment.internal.Runner;
import com.xworkz.inheretence.internal.Window;

public class WindowRunner {
        public static void main(String[] args) {
            Window w = new Window();
            System.out.println(w);
            System.out.println(new Window().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(w));

            Window window1 = new Window();
            window1.setOpen(true);
            Window window2 = new Window();
            window2.setOpen(false);
            boolean same = window1.equals(window2);
            System.out.println("both same: " + same);
        }
    }

