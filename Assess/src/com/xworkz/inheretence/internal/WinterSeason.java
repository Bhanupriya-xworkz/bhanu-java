package com.xworkz.inheretence.internal;

    public class WinterSeason extends Season {
        public void winterInfo() {
            System.out.println("This is the winter season, characterized by the coldest temperatures of the year.");
        }

        {
            super.seasonTypes();
            System.out.println("Winter is one of the four main seasons, usually followed by spring.");
        }

        {
            super.duration();
            System.out.println("Winter typically lasts from December to February in the Northern Hemisphere.");
        }

        {
            super.seasonalActivities();
            System.out.println("Winter activities include skiing, ice skating, snowboarding, and celebrating holidays like Christmas.");
        }

        {
            super.climate();
            System.out.println("Winter brings cold weather, snow, and longer nights, particularly in the higher latitudes.");
        }
    }

