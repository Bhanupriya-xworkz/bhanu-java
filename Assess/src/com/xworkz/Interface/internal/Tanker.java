package com.xworkz.Interface.internal;

    public interface Tanker {
        void load();
        void unload();
        void checkCapacity();

        default void tankerTip() {
            System.out.println("General Tip: Always inspect valves and seals before loading.");
        }
    }

