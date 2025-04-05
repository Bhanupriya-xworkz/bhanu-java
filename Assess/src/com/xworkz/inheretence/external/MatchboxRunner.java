package com.xworkz.inheretence.external;
import com.xworkz.inheretence.internal.LuxuryMatchbox;
import com.xworkz.inheretence.internal.Matchbox;

public class MatchboxRunner {
        public static void main(String[] args) {
            Matchbox matchbox = new LuxuryMatchbox();
            matchbox.material();

            Matchbox basicMatchbox = new Matchbox();
        }
    }

