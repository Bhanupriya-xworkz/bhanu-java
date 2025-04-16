package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Game;
import com.xworkz.Interface.internal.VideoGame;

public class GameMain {
        public static void main(String[] args) {

            Game game1 = new VideoGame();
            Game game2 = new VideoGame();
            Game game3 = new VideoGame();

            game1.start();
            game2.play();
            game3.end();
        }
    }

