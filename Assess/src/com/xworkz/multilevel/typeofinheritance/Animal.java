package com.xworkz.multilevel.typeofinheritance;

public class Animal {
    public void Speak(){
        System.out.println("Animal makes a sound.");
    }
}
public class Dog extends Animal {
    public void bark(){
        System.out.println("Dog barks.");
    }
}
public class Main {
    public static void Main(Sring[] args){
       Dog dog=new Dog();
       dog.speak();
       dog.bark();
    }
}





