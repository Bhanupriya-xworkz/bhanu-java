package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.LuxurySofa;
import com.xworkz.inheretence.internal.Sofa;

public class SofaRunner {
        public static void main(String[] args) {
            Sofa sofa = new LuxurySofa();
            sofa.sofaTypes();

            Sofa basicSofa = new Sofa();
        }
    }

