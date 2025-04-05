package com.xworkz.inheretence.internal;

    public class HighCapacityMemoryCard extends MemoryCard {
        public void highCapacityInfo() {
            System.out.println("This is a high-capacity memory card with large storage.");
        }

        {
            super.storageCapacity();
            System.out.println("High-capacity memory cards can store hundreds of gigabytes to terabytes of data.");
        }

        {
            super.speed();
            System.out.println("High-capacity memory cards have faster read and write speeds to handle large data transfers.");
        }

        {
            super.compatibility();
            System.out.println("High-capacity memory cards are compatible with modern devices and are ideal for 4K video recording.");
        }

        {
            super.durability();
            System.out.println("High-capacity memory cards are built with more durable materials to prevent data loss from physical damage.");
        }
    }

