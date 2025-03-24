package com.xworkz.chaining;
public class Balloon {

    String color;
    String shape;
    int quantity;
    int price;
    int length;
    boolean isBurst;

    public Balloon(){

    }

    public Balloon(String color){
        this.color = color;
    }

    public Balloon (String color, String shape){
        this(color);
        this.shape = shape;
    }

    public Balloon (String color, String shape, int quantity){
        this( color,  shape);
        this.quantity = quantity;
    }

    public Balloon (String color, String shape, int quantity, int price){
        this( color,  shape,  quantity);
        this.price = price;
    }

    public Balloon (String color, String shape, int quantity, int price, int length){
        this( color,  shape,  quantity,  price);
        this.length = length;
    }

    public Balloon (String color, String shape, int quantity, int price, int length, boolean isBurst){
        this( color,  shape,  quantity,  price,  length);
        this.isBurst = isBurst;
    }

    public void display(){
        System.out.println("Color : " + this.color);
        System.out.println("Shape : " + this.shape);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Price : " + this.price);
        System.out.println("Length : "+this.length);
        System.out.println("isBurst : "+ this.isBurst);
        System.out.println("=======================");

    }

}

