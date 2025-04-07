package com.xworkz.method.external;

import com.xworkz.method.internal.Keyboard;
import com.xworkz.method.internal.SmartKeyboard;

    public class KeyboardRunner {

        public static void main(String[] args) {

            // Creating Keyboard object
            Keyboard keyboard1 = new Keyboard();
            keyboard1.type();
            keyboard1.connect();
            keyboard1.clean();
            keyboard1.disconnect();
            keyboard1.changeBatteries();
            keyboard1.store();

            System.out.println("=============");

            // Creating SmartKeyboard object
            SmartKeyboard smartKeyboard = new SmartKeyboard();
            smartKeyboard.type();
            smartKeyboard.connect();
            smartKeyboard.clean();
            smartKeyboard.disconnect();
            smartKeyboard.changeBatteries();
            smartKeyboard.store();
        }
    }
