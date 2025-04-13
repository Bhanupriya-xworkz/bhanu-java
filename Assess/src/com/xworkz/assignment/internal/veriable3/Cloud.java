package com.xworkz.assignment.internal.veriable3;

public class Cloud {

    private String type;
    private double height;
    private boolean isRainy;

    public Cloud() {
        System.out.println("Running non-arg constructor Cloud");
        System.out.println("type: " + this.type);
        this.type = "Cumulus";
        this.height = 2000.0;
        this.isRainy = false;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Height: " + height + " meters, Is Rainy: " + isRainy;
    }

    @Override
    public int hashCode() {
        System.out.println("CloudHashCode: " + super.hashCode());
        return 6789;  // Arbitrary hash code
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRainy(boolean isRainy) {
        this.isRainy = isRainy;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            Cloud cloud1 = this;
            Cloud cloud2 = (Cloud) obj;
            if (obj instanceof Cloud) {
                System.out.println("Have reference, will compare...");
                if (cloud1.type.equals(cloud2.type) && cloud1.height == cloud2.height && cloud1.isRainy == cloud2.isRainy) {
                    System.out.println("Both are the same");
                    return true;
                }
            }
        }
        return false;
    }
}

