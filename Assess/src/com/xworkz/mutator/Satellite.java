package com.xworkz.mutator;

public class Satellite {
    // Enum for Satellite Types
    enum SatelliteType {
        COMMUNICATION,
        WEATHER,
        NAVIGATION,
        EARTH_OBSERVATION
    }

    public class Satellite {
        // Private instance variables
        private SatelliteType type;
        private double cost;
        private double weight;
        private int localCapacity;

        // Constructor
        public Satellite(SatelliteType type, double cost, double weight, int localCapacity) {
            this.type = type;
            this.cost = cost;
            this.weight = weight;
            this.localCapacity = localCapacity;
        }

        // Accessor method for type
        public SatelliteType getType() {
            return type;
        }

        // Mutator method for type
        public void setType(SatelliteType type) {
            this.type = type;
        }

        // Accessor method for cost
        public double getCost() {
            return cost;
        }

        // Mutator method for cost
        public void setCost(double cost) {
            this.cost = cost;
        }

        // Accessor method for weight
        public double getWeight() {
            return weight;
        }

        // Mutator method for weight
        public void setWeight(double weight) {
            this.weight = weight;
        }

        // Accessor method for localCapacity
        public int getLocalCapacity() {
            return localCapacity;
        }

        // Mutator method for localCapacity
        public void setLocalCapacity(int localCapacity) {
            this.localCapacity = localCapacity;
        }
    }

}
