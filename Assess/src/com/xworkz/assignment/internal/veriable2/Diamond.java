package com.xworkz.assignment.internal.veriable2;

public class Diamond {
    private String color;
    private double weight;
    private boolean isCut;

    public Diamond(String color, double weight, boolean isCut) {
        this.color = color;
        this.weight = weight;
        this.isCut = isCut;
    }

    @Override
    public String toString() {
        return "Diamond{color=" + color + ", weight=" + weight + " carats, isCut=" + isCut + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("DiamondHashCode:" + super.hashCode());
        return 8753;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setIsCut(boolean isCut) {
        this.isCut = isCut;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Diamond) {
                System.out.println("have ref. will compare..");
                Diamond diamond1 = this;
                Diamond diamond2 = (Diamond) obj;
                if (diamond1.color.equals(diamond2.color) && diamond1.weight == diamond2.weight && diamond1.isCut == diamond2.isCut) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
