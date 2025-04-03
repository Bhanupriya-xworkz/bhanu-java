package com.xworkz.inheretence.external;

    public class WireRunner {
        public static void main(String[] args) {

            Wire wire = new SmartWire();

            Wire basicWire = new Wire();


            wire.checkLength();
            wire.checkMaterial();
            wire.connect();
            wire.disconnect();
            wire.insulateWire();
            ((SmartWire) wire).monitorPowerFlow();
            ((SmartWire) wire).controlHeat();
            ((SmartWire) wire).sendAlerts();

            basicWire.checkLength();
            basicWire.checkMaterial();
            basicWire.connect();
        }
    }
