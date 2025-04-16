package com.xworkz.Interface.external.Mainrunner;
import com.xworkz.Interface.internal.RedLight;
import com.xworkz.Interface.internal.TrafficSignal;

public class Home {
        public static void main(String[] args) {
            TrafficSignal signal1 = new RedLight();
            TrafficSignal signal2 = new RedLight();
            TrafficSignal signal3 = new RedLight();

            signal1.showSignal();
            signal2.waitTime();
            signal3.actionToTake();
        }
    }

