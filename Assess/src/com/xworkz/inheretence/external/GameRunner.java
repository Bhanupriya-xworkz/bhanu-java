package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.DigitalGame;
import com.xworkz.inheretence.internal.Game;

public class GameRunner {
        public static void main(String[] args) {
            // Creating an instance of DigitalGame using Game reference
            Game digitalGame = new DigitalGame();

            // Creating an instance of Game
            Game traditionalGame = new Game();
        }
    }
