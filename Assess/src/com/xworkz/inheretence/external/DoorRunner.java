package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Door;
import com.xworkz.inheretence.internal.SlidingDoor;

public class DoorRunner {
        public static void main(String[] args) {

            Door myDoor = new SlidingDoor();

            Door basicDoor = new Door();

            myDoor.open();
            myDoor.close();
            myDoor.lock();
            myDoor.unlock();
            myDoor.displayInfo();

            ((SlidingDoor) myDoor).autoSlide();
        }
    }

