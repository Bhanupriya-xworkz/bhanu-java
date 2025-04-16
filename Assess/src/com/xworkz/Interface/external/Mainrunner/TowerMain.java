package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.SignalTower;
import com.xworkz.Interface.internal.Tower;

public class TowerMain {
        public static void main(String[] args) {

            Tower tower1 = new SignalTower();
            Tower tower2 = new SignalTower();
            Tower tower3 = new SignalTower();

            tower1.transmitSignal();
            tower2.receiveSignal();
            tower3.towerStatus();
        }
    }

