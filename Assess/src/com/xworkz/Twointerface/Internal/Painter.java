package com.xworkz.Twointerface.Internal;

    public class Painter implements Artist, ArtStyle {

        @Override
        public void getName() {
            System.out.println("Artist: Leonardo da Vinci");
        }

        @Override
        public void getFamousWork() {
            System.out.println("Famous Work: Mona Lisa");
        }

        @Override
        public void getStyleName() {
            System.out.println("Style: Renaissance");
        }

        @Override
        public void getPeriod() {
            System.out.println("Period: 15th Century");
        }
    }

public class Sculptor implements Artist, ArtStyle {

    @Override
    public void getName() {
        System.out.println("Artist: Michelangelo");
    }

    @Override
    public void getFamousWork() {
        System.out.println("Famous Work: David");
    }

    @Override
    public void getStyleName() {
        System.out.println("Style: High Renaissance");
    }

    @Override
    public void getPeriod() {
        System.out.println("Period: 16th Century");
    }
}

