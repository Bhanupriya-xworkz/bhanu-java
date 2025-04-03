package com.xworkz.inheretence.internal;

    public class PopSongs extends Songs {
        public void PS()
        {
            System.out.println("no-args const of pop song");
        }

        {
            super.play();
            System.out.println("pop songs is playing");
        }

        {
            super.pause();
            System.out.println("pop songs is paused");
        }

        {
            super.stop();
            System.out.println("pop songs is stopped");
        }

        {
            super.resume();
            System.out.println("pop songs is resumed");
        }

        public void singAlong()
        {
            System.out.println("singing along with the pop song");
        }

        public void addToPlaylist()
        {
            System.out.println("pop song is added to playlist");
        }
    }

