package com.xworkz.method.external;
import
import com.xworkz.method.internal.Cup;
import com.xworkz.method.internal.Cafe;

public class CupRunner {
        public static void main(String[] args) {

            System.out.println("Using Cup object:");
            Cup cup = new Cup();
            cup.fill();
            cup.empty();
            cup.clean();
            cup.use();
            cup.display();
            cup.cupSpecial();

            System.out.println("=====================");

            Container container = new Container();
            container.fill();
            container.empty();
            container.clean();
            container.use();
            container.display();

            System.out.println("=====================");

            Cafe cafe = new Cafe();
            cafe.Dbc(container);
            cafe.Dbc(cafe);
        }
    }

