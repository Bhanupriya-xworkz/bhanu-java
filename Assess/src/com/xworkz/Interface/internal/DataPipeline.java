package com.xworkz.Interface.internal;

    public class DataPipeline implements Pipeline {

        @Override
        public void start() {
            System.out.println("Pipeline started: Initializing resources and setting up environment.");
        }

        @Override
        public void process() {
            System.out.println("Pipeline processing: Transforming and analyzing data.");
        }

        @Override
        public void stop() {
            System.out.println("Pipeline stopped: Releasing resources and finalizing output.");
        }
    }

