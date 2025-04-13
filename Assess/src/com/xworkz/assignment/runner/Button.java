package com.xworkz.assignment.runner;
import com.xworkz.assignment.internal.veriable.Button;

public class ButtonRunner {
        public static void main(String[] args) {
            Button b = new Button();
            System.out.println(b);
            System.out.println(new Button().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(b));

            Button button1 = new Button();
            button1.setPressed(true);
            Button button2 = new Button();
            button2.setPressed(false);
            boolean same = button1.equals(button2);
            System.out.println("both same:" + same);
        }
    }

