package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Smartphone;
import com.xworkz.Interface.internal.Gadget;

    public class GadgetMain {
        public static void main(String[] args) {
            Gadget gadget1 = new Smartphone();
            Gadget gadget2 = new Smartphone();
            Gadget gadget3 = new Smartphone();

            gadget1.powerOn();
            gadget2.showSpecs();
            gadget3.shutdown();
        }
    }

