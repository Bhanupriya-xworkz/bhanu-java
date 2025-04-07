package com.xworkz.method.external;

import com.xworkz.inheretence.internal.Smartphone;
import com.xworkz.inheretence.internal.Laptop;

public class LaptotRunner {

        public static void main(String[] args) {

            Laptop laptop1 = new Laptop();
            laptop1.bootUp();
            laptop1.browse();
            laptop1.playGames();
            laptop1.watchMovies();
            laptop1.shutDown();
            laptop1.charge();

            System.out.println("=============");

            Smartphone smartphone = new Smartphone();
            smartphone.bootUp();
            smartphone.browse();
            smartphone.playGames();
            smartphone.watchMovies();
            smartphone.shutDown();
            smartphone.charge();
        }
    }
