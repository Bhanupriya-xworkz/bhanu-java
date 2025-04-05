package com.xworkz.inheretence.internal;

    public class UrbanTraffic extends Traffic {
        public void urbanTrafficInfo() {
            System.out.println("This is urban traffic, which is typically more complex and congested than rural traffic.");
        }

        {
            super.vehicles();
            System.out.println("Urban traffic has a wide variety of vehicles including cars, buses, motorcycles, and bicycles.");
        }

        {
            super.signals();
            System.out.println("In urban areas, traffic signals are abundant, managing intersections at every corner.");
        }

        {
            super.congestion();
            System.out.println("Urban areas experience high traffic congestion, especially during rush hours.");
        }

        {
            super.roadSafety();
            System.out.println("Urban areas focus on pedestrian crossings, traffic cameras, and public transportation to enhance road safety.");
        }
    }

