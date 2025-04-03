package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Poison;
import com.xworkz.inheretence.internal.VenomousPoison;

public class PoisonRunner {
        public static void main(String[] args) {
            Poison poison = new VenomousPoison();
            Poison basicPoison = new Poison();
        }
    }

