package com.xworkz.Twointerface.Internal;

    public class CricketGame implements Game, Player {

        @Override
        public void startGame() {
            System.out.println("Cricket match has started!");
        }

        @Override
        public void endGame() {
            System.out.println("Cricket match has ended!");
        }

        @Override
        public void getPlayerName() {
            System.out.println("Player: Virat Kohli");
        }

        @Override
        public void getScore() {
            System.out.println("Score: 85 runs");
        }
    }

public class FootballGame implements Game, Player {

    @Override
    public void startGame() {
        System.out.println("Football match has kicked off!");
    }

    @Override
    public void endGame() {
        System.out.println("Football match is over!");
    }

    @Override
    public void getPlayerName() {
        System.out.println("Player: Lionel Messi");
    }

    @Override
    public void getScore() {
        System.out.println("Score: 2 goals");
    }
}


