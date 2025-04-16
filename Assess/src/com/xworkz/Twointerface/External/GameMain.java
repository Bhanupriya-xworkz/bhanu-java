package com.xworkz.Twointerface.External;

import com.xworkz.Interface.internal.Game;
import com.xworkz.Twointerface.Internal.CricketGame;

public class MainClass {
        public static void main(String[] args) {

            Game game1 = new CricketGame();
            Game game2 = new FootballGame();

            game1.startGame();
            game2.endGame();

            Player player1 = new CricketGame();
            Player player2 = new FootballGame();

            player1.getPlayerName();
            player2.getScore();
        }
    }

