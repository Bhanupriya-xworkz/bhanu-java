package com.xworkz.initusingconstructor;

public class AnkletRunner {
    public static void main(String[] args){
        Anklet anklet1 = new Anklet("Gold", 15, 800000);
        Anklet anklet2 = new Anklet("Silver", 8, 5000);
        Anklet anklet3 = new Anklet("Thread", 13, 400);
        Anklet anklet4 = new Anklet("Silver plated", 10, 3000);
        Anklet anklet5 = new Anklet("Gold plated",8 , 100000);

        System.out.println("anklet1 material : "+anklet1.material);
        System.out.println("anklet1 length : "+anklet1.length);
        System.out.println("anklet1 price : "+anklet1.price);

        System.out.println("=====================");

        System.out.println("anklet2 material : "+anklet2.material);
        System.out.println("anklet2 length : "+anklet2.length);
        System.out.println("anklet2 price : "+anklet2.price);

        System.out.println("=====================");

        System.out.println("anklet3 material : "+anklet3.material);
        System.out.println("anklet3 length : "+anklet3.length);
        System.out.println("anklet3 price : "+anklet3.price);

        System.out.println("=====================");

        System.out.println("anklet4 material : "+anklet4.material);
        System.out.println("anklet4 length : "+anklet4.length);
        System.out.println("anklet4 price : "+anklet4.price);

        System.out.println("=====================");

        System.out.println("anklet5 material : "+anklet5.material);
        System.out.println("anklet5 length : "+anklet5.length);
        System.out.println("anklet5 price : "+anklet5.price);

        Anklet.tieIt(2);

    }
}

