package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Traffic;
import com.xworkz.inheretence.internal.UrbanTraffic;

public class TrafficRunner {
        public static void main(String[] args) {
            Traffic traffic = new UrbanTraffic();
            traffic.vehicles();

            Traffic basicTraffic = new Traffic();
        }
    }

