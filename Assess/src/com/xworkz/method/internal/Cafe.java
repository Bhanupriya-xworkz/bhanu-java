package com.xworkz.method.internal;

    public class Cafe extends Container {

        public void signatureDrink() {
            System.out.println("Cafe serves a signature drink in a cup.");
        }
        public void Dbc(Container container) {
            container.fill();
            container.empty();
            container.clean();
            container.use();
            container.display();

            if (container instanceof Cafe) {
                Cafe cafe = (Cafe) container;
                System.out.println("Container is an instance of Cafe.");
                cafe.signatureDrink();
            }
        }
    }

