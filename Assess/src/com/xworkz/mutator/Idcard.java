package com.xworkz.mutator;
public class Idcard {

        private String material;
        private String[] colors; // Array of colors
        private double weight;
        private String designedBy;

        public IdCard(String material, String[] colors, double weight, String designedBy) {
            this.material = material;
            this.colors = colors;
            this.weight = weight;
            this.designedBy = designedBy;
        }
        public String getMaterial() {
            return material;
        }

        public String[] getColors() {
            return colors;
        }

        public double getWeight() {
            return weight;
        }

        public String getDesignedBy() {
            return designedBy;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setColors(String[] colors) {
            this.colors = colors;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setDesignedBy(String designedBy) {
            this.designedBy = designedBy;
        }

        }