package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Musicplayer;
import com.xworkz.Interface.internal.Spotifyplayer;
    public class MusicplayerMain {
        public static void main(String[] args) {
            Musicplayer player1 = new Spotifyplayer();
            Musicplayer player2 = new Spotifyplayer();
            Musicplayer player3 = new Spotifyplayer();

            player1.play();
            player2.pause();
            player3.stop();

            player.playerTip();
        }
    }

