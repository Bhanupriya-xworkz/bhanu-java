package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Ring;
import com.xworkz.inheretence.internal.SmartRing;

public class RingRunner {
        public static void main(String[] args) {

            Ring ring = new SmartRing();

            Ring basicRing = new Ring();

            ring.checkSize();
            ring.checkMaterial();
            ring.wearRing();
            ring.cleanRing();
            ring.storeRing();
            ((SmartRing) ring).trackHeartRate();
            ((SmartRing) ring).trackSteps();
            ((SmartRing) ring).enableSleepTracking();
            ((SmartRing) ring).syncWithPhone();

            basicRing.checkSize();
            basicRing.checkMaterial();
            basicRing.wearRing();
        }
    }
