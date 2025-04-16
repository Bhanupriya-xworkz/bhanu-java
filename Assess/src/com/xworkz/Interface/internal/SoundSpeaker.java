package com.xworkz.Interface.internal;

    public class SoundSpeaker implements Speaker {
        @Override
        public void connect() {
            System.out.println("BluetoothSpeaker executing: connect");
        }

        @Override
        public void playMusic() {
            System.out.println("BluetoothSpeaker executing: playMusic");
        }

        @Override
        public void disconnect() {
            System.out.println("BluetoothSpeaker executing: disconnect");
        }
    }

