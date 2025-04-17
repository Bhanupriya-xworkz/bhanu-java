package com.xworkz.Interface.internal;

    public interface Pipeline {
        void start();
        void process();
        void stop();

        default void pipelineTip() {
            System.out.println("General Tip: Regular maintenance ensures smooth flow and prevents blockages.");
        }
    }

