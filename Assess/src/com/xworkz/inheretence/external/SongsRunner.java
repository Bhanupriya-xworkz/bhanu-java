package com.xworkz.inheretence.external;

import com.xworkz.inheretance.external.PopSong;
import com.xworkz.inheretance.external.Song;

    public class SongRunner {
        public static void main(String[] args) {

            Song song = new PopSong();
            Song basicSong = new Song();


            basicSong.play();
            basicSong.pause();
            basicSong.stop();
            basicSong.resume();


            PopSong popSong = new PopSong();
            popSong.singAlong();
            popSong.addToPlaylist();
            popSong.play();
        }
    }

