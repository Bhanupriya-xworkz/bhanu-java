package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.MusicPlayer;
import com.xworkz.inheretence.internal.SmartMusicPlayer;

public class MusicPlayerRunner {
        public static void main(String[] args) {

            MusicPlayer player = new SmartMusicPlayer("Sony", true, "Spotify");

            MusicPlayer basicPlayer = new MusicPlayer("Panasonic");
        }
    }

