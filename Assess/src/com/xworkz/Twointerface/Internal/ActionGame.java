package com.xworkz.Twointerface.Internal;

    public class ActionGame implements Game, Console {

        @Override
        public void getGameName() {
            System.out.println("Game: Assassin's Creed");
        }

        @Override
        public void getGenre() {
            System.out.println("Genre: Action/Adventure");
        }

        @Override
        public void getCompatibleConsole() {
            System.out.println("Compatible with: PS5, Xbox Series X");
        }

        @Override
        public void getGraphicsLevel() {
            System.out.println("Graphics: Ultra HD");
        }
    }


public class RacingGame implements Game, Console {

    @Override
    public void getGameName() {
        System.out.println("Game: Need for Speed");
    }

    @Override
    public void getGenre() {
        System.out.println("Genre: Racing");
    }

    @Override
    public void getCompatibleConsole() {
        System.out.println("Compatible with: PS4, PC");
    }

    @Override
    public void getGraphicsLevel() {
        System.out.println("Graphics: High");
    }
}

