package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.MediaPlayer;
import com.xworkz.Interface.internal.VLCPlayer;

public class MediaPlayerMain {
        public static void main(String[] args) {
            MediaPlayer player = new VLCPlayer();
            player.play();
            player.pause();
            player.stop();

            player.mediaPlayerTip();
        }
    }


