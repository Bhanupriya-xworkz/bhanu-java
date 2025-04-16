package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.ChemistryExperiment;
import com.xworkz.Twointerface.Internal.PhysicsExperiment;

public class Experiment {

        public static void main(String[] args) {
            Experiment exp1 = new PhysicsExperiment();
            Experiment exp2 = new ChemistryExperiment();

            exp1.getExperimentName();
            exp2.getToolsUsed();

            Result res1 = new PhysicsExperiment();
            Result res2 = new ChemistryExperiment();

            res1.getOutcome();
            res2.getConclusion();
        }
    }

