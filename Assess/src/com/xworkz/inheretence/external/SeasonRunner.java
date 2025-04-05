package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Season;
import com.xworkz.inheretence.internal.WinterSeason;

public class SeasonRunner {
        public static void main(String[] args) {
            Season season = new WinterSeason();  // Polymorphism: A WinterSeason object is treated as a Season
            season.seasonTypes();  // Calls the overridden method from WinterSeason

            Season basicSeason = new Season();  // Creating an object of the base class Season
        }
    }

