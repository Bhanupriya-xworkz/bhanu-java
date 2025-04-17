package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Gadget;
import com.xworkz.Interface.internal.SmartPhone;

    public class GadgetMain {
        public static void main(String[] args) {
            Gadget gadget1 = new SmartPhone();
            Gadget gadget2 = new SmartPhone();
            Gadget gadget3 = new SmartPhone();

            gadget1.powerOn();
            gadget2.showSpecs();
            gadget3.shutdown();
            Gadget.maintenanceTips();
        }
    }

