package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Plastic;
import com.xworkz.inheretence.internal.RecyclablePlastic;


public class PlasticRunner {
        public static void main(String[] args) {
            Plastic plastic = new RecyclablePlastic();
            Plastic basicPlastic = new Plastic();
        }
    }

