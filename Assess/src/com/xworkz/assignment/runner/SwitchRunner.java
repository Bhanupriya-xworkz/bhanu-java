package com.xworkz.assignment.runner;
import com.xworkz.inheretence.internal.Switch;

public class SwitchRunner {
        public static void main(String[] args) {
            Switch s = new Switch();
            System.out.println(s);
            System.out.println(new Switch().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(s));

            Switch switch1 = new Switch();
            switch1.setOn(true);
            Switch switch2 = new Switch();
            switch2.setOn(false);
            boolean same = switch1.equals(switch2);
            System.out.println("both same:" + same);
        }
    }

