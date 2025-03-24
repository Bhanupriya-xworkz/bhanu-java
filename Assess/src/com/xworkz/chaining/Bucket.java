package com.xworkz.chaining;
public class Bucket {
    String material;
    String color;
    int capacity;
    boolean hasHandle;
    boolean isPlastic;
    boolean isWaterproof;

    public Bucket() {
    }

    public Bucket(String material) {
        this.material = material;
    }

    public Bucket(String material, String color) {
        this(material);
        this.color = color;
    }

    public Bucket(String material, String color, int capacity) {
        this(material, color);
        this.capacity = capacity;
    }

    public Bucket(String material, String color, int capacity, boolean hasHandle) {
        this(material, color, capacity);
        this.hasHandle = hasHandle;
    }

    public Bucket(String material, String color, int capacity, boolean hasHandle, boolean isPlastic) {
        this(material, color, capacity, hasHandle);
        this.isPlastic = isPlastic;
    }

    public Bucket(String material, String color, int capacity, boolean hasHandle, boolean isPlastic, boolean isWaterproof) {
        this(material, color, capacity, hasHandle, isPlastic);
        this.isWaterproof = isWaterproof;
    }

    public void display() {
        System.out.println("Material: " + this.material);
        System.out.println("Color: " + this.color);
        System.out.println("Capacity: " + this.capacity + " liters");
        System.out.println("Has Handle: " + this.hasHandle);
        System.out.println("Is Plastic: " + this.isPlastic);
        System.out.println("Is Waterproof: " + this.isWaterproof);
        System.out.println("=============================");
    }
}

