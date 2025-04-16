package com.xworkz.Interface.external.Mainrunner;
import com.xworkz.Interface.internal.Animal;
import com.xworkz.Interface.internal.Dog;

public class TestAnimal {
        public static void main(String[] args) {
            Animal dog1 = new Dog();
            Animal dog2 = new Dog();
            Animal dog3 = new Dog();

            dog1.eat();
            dog2.sleep();
            dog3.makeSound();
        }
    }

