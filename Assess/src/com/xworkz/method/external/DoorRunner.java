package com.xworkz.method.external;

import com.xworkz.inheretence.internal.Door;
import com.xworkz.method.internal.SmartDoor;

public class DoorRunner {
        public static void main(String[] args) {
            // Using the basic Door class
            Door door = new Door();
            door.open();
            door.close();
            door.lock();
            door.unlock();
            door.displayStatus();

            System.out.println("=============");

            // Using the SmartDoor class
            SmartDoor smartDoor = new SmartDoor();
            smartDoor.open();
            smartDoor.close();
            smartDoor.lock();
            smartDoor.unlock();
            smartDoor.displayStatus();

            // SmartDoor specific methods
            smartDoor.monitorEntry();
            smartDoor.sendAlert();
            smartDoor.remoteControl();
        }
}
