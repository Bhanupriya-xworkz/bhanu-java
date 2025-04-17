package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.CasualSlipper;
import com.xworkz.Interface.internal.Slipper;

public class SlipperMain {

        public static void main(String[] args) {
            Slipper slipper1 = new CasualSlipper();
            Slipper slipper2 = new CasualSlipper();
            Slipper slipper3 = new CasualSlipper();

            slipper1.wear();
            slipper2.remove();
            slipper3.clean();

            slipper.slipperTip();
        }
    }

