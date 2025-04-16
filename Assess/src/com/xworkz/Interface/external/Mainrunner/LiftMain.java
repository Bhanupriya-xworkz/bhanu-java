package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Lift;
import com.xworkz.Interface.internal.Elevetor;

    public class LiftMain {
        public static void main(String[] args) {
            Lift lift1 = new Elevetor();
            lift1.callLift();
            lift1.moveToFloor();
            lift1.openDoor();
        }
    }

