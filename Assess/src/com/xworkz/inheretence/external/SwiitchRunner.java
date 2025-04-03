package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.NintendoSwitch;
import com.xworkz.inheretence.internal.Switch;

public class SwitchRunner {
        public static void main(String[] args) {

            Switch console = new NintendoSwitch();

            Switch basicSwitch = new Switch();

            console.startGame();
            console.checkBattery();
            console.updateSoftware();
            console.connectController();
            console.enableSleepMode();
            ((NintendoSwitch) console).enableDockingMode();  // Casting to access NintendoSwitch specific method
            ((NintendoSwitch) console).enableHandheldMode();
            ((NintendoSwitch) console).playMultiplayer();

            basicSwitch.startGame();
            basicSwitch.checkBattery();
        }
    }

