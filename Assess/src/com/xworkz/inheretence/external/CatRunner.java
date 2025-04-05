package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Cat;
import com.xworkz.inheretence.internal.PersianCat;

public class CatRunner {
        public static void main(String[] args) {
            Cat cat = new PersianCat();
            cat.sound();

            Cat basicCat = new Cat();
        }
    }

