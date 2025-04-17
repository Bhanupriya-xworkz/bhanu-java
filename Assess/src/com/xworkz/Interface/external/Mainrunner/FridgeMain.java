package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.DoubleDoorFridge;
import com.xworkz.Interface.internal.Fridge;

public class FridgeMain {
        public static void main(String[] args) {
            Fridge fridge1 = new DoubleDoorFridge();
            Fridge fridge2 = new DoubleDoorFridge();
            Fridge fridge3 = new DoubleDoorFridge();

            fridge1.cool();
            fridge2.storeFood();
            fridge3.defrost();
            Fridge.maintenanceTips();
        }
    }

