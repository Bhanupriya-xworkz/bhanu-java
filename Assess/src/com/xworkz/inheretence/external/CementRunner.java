package com.xworkz.inheretence.external;

import com.xworkz.inheritance.external.ConcreteCement;
import com.xworkz.inheritance.external.Cement;

    public class CementRunner {
        public static void main(String[] args) {
            Cement cement = new ConcreteCement();
            Cement basicCement = new Cement();

            basicCement.mix();
            basicCement.set();
            basicCement.dry();
            basicCement.harden();

            ConcreteCement concreteCement = new ConcreteCement();
            concreteCement.pour();
            concreteCement.reinforce();
            concreteCement.mix();
        }
    }

