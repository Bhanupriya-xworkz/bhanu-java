package com.xworkz.Twointerface.Internal;

    public class PhysicsExperiment implements Experiment, Result {

        @Override
        public void getExperimentName() {
            System.out.println("Experiment: Projectile Motion");
        }

        @Override
        public void getToolsUsed() {
            System.out.println("Tools: Ball, Ruler, Stopwatch");
        }

        @Override
        public void getOutcome() {
            System.out.println("Outcome: Parabolic Trajectory Observed");
        }

        @Override
        public void getConclusion() {
            System.out.println("Conclusion: Verified laws of motion");
        }
    }

public class ChemistryExperiment implements Experiment, Result {

    @Override
    public void getExperimentName() {
        System.out.println("Experiment: Acid-Base Reaction");
    }

    @Override
    public void getToolsUsed() {
        System.out.println("Tools: Beaker, Litmus Paper, Chemicals");
    }

    @Override
    public void getOutcome() {
        System.out.println("Outcome: Color Change Observed");
    }

    @Override
    public void getConclusion() {
        System.out.println("Conclusion: Confirmed acidic/basic nature");
    }
}

