package com.xworkz.method.external;

    public class MusicRunner {
        public static void main(String[] args) {
            Music music = new Music();
            music.play();
            music.record();
            music.pause();
            music.stop();
            music.mix();

            System.out.println("=====================");

            Sound sound = new Sound();
            sound.play();
            sound.record();
            sound.pause();
            sound.stop();
            sound.mix();

            System.out.println("=====================");

            Studio studio = new Studio();
            studio.Dbc(sound);
            studio.Dbc(studio);
        }
    }
