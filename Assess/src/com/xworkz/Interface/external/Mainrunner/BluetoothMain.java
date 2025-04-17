package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Bluetooth;
import com.xworkz.Interface.internal.BluetoothSpeaker;

public class BluetoothMain {
        public static void main(String[] args) {
            Bluetooth bt1 = new BluetoothSpeaker();
            Bluetooth bt2 = new BluetoothSpeaker();
            Bluetooth bt3 = new BluetoothSpeaker();

            bt1.pairDevice();
            bt2.transferData();
            bt3.unpairDevice();
            MySpeaker.connectionTips();
        }
    }

