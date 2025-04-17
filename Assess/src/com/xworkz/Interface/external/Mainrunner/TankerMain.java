package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Tanker;
import com.xworkz.Interface.internal.WaterTanker;

public class TankerMain {
    public static void main(String[] args) {

        Tanker tanker1 = new WaterTanker();
        Tanker tanker2 = new WaterTanker();
        Tanker tanker3 = new WaterTanker();

        tanker1.load();
        tanker2.unload();
        tanker3.checkCapacity();

        tanker.tankerTip();
    }
}

