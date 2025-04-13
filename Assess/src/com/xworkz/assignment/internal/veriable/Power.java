package com.xworkz.assignment.internal.veriable;


public class Power {
    private String source;
    private double capacity;
    private boolean isRenewable;

    public Power() {
        System.out.println("Running no-arg constructor of Power");
        this.source = "Solar";
        this.capacity = 1000.0;
        this.isRenewable = true;
    }

    @Override
    public String toString() {
        return "Source: " + source + ", Capacity: " + capacity + "W, Is Renewable: " + isRenewable;
    }

    @Override
    public int hashCode() {
        System.out.println("PowerHashCode" + super.hashCode());
        return 310;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Power) {
                System.out.println("have ref. will compare..");
                Power power1 = this;
                Power power2 = (Power) obj;
                if (power1.source.equals(power2.source)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

