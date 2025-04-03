package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Electromagnet;
import com.xworkz.inheretence.internal.Magnet;

public class MagnetRunner {
        public static void main(String[] args) {

            Magnet myMagnet = new Electromagnet();

            Magnet basicMagnet = new Magnet();

            myMagnet.attractMetal();
            myMagnet.repel();
            myMagnet.displayInfo();

            ((Electromagnet) myMagnet).turnOnElectricity();
        }
    }

