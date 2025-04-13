package com.xworkz.method.external;

import com.xworkz.method.internal.Bakery;
import com.xworkz.method.internal.Cookies;

public class CookiesRunner {
        public static void main(String[] args) {

            System.out.println("Using Cookies object:");
            Cookies cookies = new Cookies();
            cookies.bake();
            cookies.serve();
            cookies.pack();
            cookies.eat();
            cookies.display();
            cookies.cookieSpecial();

            System.out.println("=====================");

            Snack snack = new Snack();
            snack.bake();
            snack.serve();
            snack.pack();
            snack.eat();
            snack.display();

            System.out.println("=====================");

            Bakery bakery = new Bakery();
            bakery.Dbc(snack);
            bakery.Dbc(bakery);
        }
    }

