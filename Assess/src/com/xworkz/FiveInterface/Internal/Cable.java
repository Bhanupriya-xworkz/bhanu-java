package com.xworkz.FiveInterface.Internal;

    abstract class Cable {
        abstract void connectDevice();
        abstract void disconnectDevice();
        abstract void transferData();
    }

    interface FastDataTransfer {
        void enableFastTransfer();
    }

    interface PowerDelivery {
        void supportPowerDelivery();
    }

    interface BraidedDesign {
        void showBraidedStrength();
    }


    interface MagneticTip {
        void attachMagnetically();
    }

    interface UniversalCompatibility {
        void checkCompatibility();
    }

