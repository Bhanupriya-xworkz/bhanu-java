package com.xworkz.assignment.runner;
import
import com.xworkz.assignment.internal.veriable.Voice;

public class VoiceRunner {
        public static void main(String[] args) {
            Voice v = new Voice();
            System.out.println(v);
            System.out.println(new Voice().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(v));

            Voice voice1 = new Voice();
            voice1.setClear(true);
            Voice voice2 = new Voice();
            voice2.setClear(false);
            boolean same = voice1.equals(voice2);
            System.out.println("both same: " + same);
        }
    }

