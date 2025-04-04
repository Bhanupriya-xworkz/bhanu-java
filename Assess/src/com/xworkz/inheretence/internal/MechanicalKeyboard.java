package com.xworkz.inheretence.internal;

    public class MechanicalKeyboard extends Keyboard {
        public void MK() {
            System.out.println("no-args constructor of MechanicalKeyboard");
        }

        {
            super.type();
            System.out.println("type on the mechanical keyboard");
        }

        {
            super.pressKey();
            System.out.println("press a key on the mechanical keyboard");
        }

        {
            super.backlight();
            System.out.println("turn on the backlight of the mechanical keyboard");
        }

        {
            super.adjustVolume();
            System.out.println("adjust volume using the mechanical keyboard");
        }

        {
            super.clean();
            System.out.println("clean the mechanical keyboard");
        }
    }

