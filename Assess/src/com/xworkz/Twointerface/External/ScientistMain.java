package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.Physicist;
import com.xworkz.Twointerface.Internal.Scientist;

public class ScientistMain {

        public static void main(String[] args) {
            Scientist s1 = new Physicist();
            Scientist s2 = new Biologist();

            s1.getName();
            s2.getField();

            Research r1 = new Physicist();
            Research r2 = new Biologist();

            r1.getProjectTitle();
            r2.getDuration();
        }
    }

