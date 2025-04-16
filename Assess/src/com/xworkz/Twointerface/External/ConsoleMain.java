package com.xworkz.Twointerface.External;

import com.xworkz.Interface.internal.Game;
import com.xworkz.Twointerface.Internal.ActionGame;

public class ConsoleMain {

        public static void main(String[] args) {
            Game g1 = new ActionGame();
            Game g2 = new RacingGame();

            g1.getGameName();
            g2.getGenre();

            Console c1 = new ActionGame();
            Console c2 = new RacingGame();

            c1.getCompatibleConsole();
            c2.getGraphicsLevel();
        }
    }

