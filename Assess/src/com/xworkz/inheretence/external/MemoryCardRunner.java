package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.HighCapacityMemoryCard;
import com.xworkz.inheretence.internal.MemoryCard;

public class MemoryCardRunner {
        public static void main(String[] args) {
            MemoryCard memoryCard = new HighCapacityMemoryCard();
            memoryCard.storageCapacity();

            MemoryCard basicMemoryCard = new MemoryCard();
        }
    }

