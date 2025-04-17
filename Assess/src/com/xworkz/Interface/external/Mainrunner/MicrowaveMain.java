package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Microwave;
import com.xworkz.Interface.internal.MicrowaveOven;

    public class MicrowaveMain {
        public static void main(String[] args) {
            Microwave microwave1 = new MicrowaveOven();
            microwave1.setTimer();
            microwave1.heatFood();
            microwave1.stopHeating();

            microwave.microwaveTip();
        }
    }


