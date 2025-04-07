package com.xworkz.method.external;

import com.xworkz.method.internal.Ring;
import com.xworkz.method.internal.SmartRing;

    public class RingRunner {

        public static void main(String[] args) {

            // Creating Ring object
            Ring ring1 = new Ring();
            ring1.wear();
            ring1.sparkle();
            ring1.adjust();
            ring1.remove();
            ring1.clean();
            ring1.store();

            System.out.println("=============");

            // Creating SmartRing object
            SmartRing smartRing = new SmartRing();
            smartRing.wear();
            smartRing.sparkle();
            smartRing.adjust();
            smartRing.remove();
            smartRing.clean();
            smartRing.store();
        }
    }
