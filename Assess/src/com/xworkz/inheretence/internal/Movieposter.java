package com.xworkz.inheretence.internal;

    public class Movieposter extends Poster {
        public void MP()
        {
            System.out.println("no-args const of movie poster");
        }

        {
            super.create();
            System.out.println("movie poster is being created with graphics and text");
        }

        {
            super.print();
            System.out.println("movie poster is being printed in large format");
        }

        {
            super.display();
            System.out.println("movie poster is displayed in a movie theater");
        }

        {
            super.store();
            System.out.println("movie poster is stored carefully to prevent damage");
        }

        public void advertise()
        {
            System.out.println("movie poster is used for advertisement purposes");
        }

        public void collect()
        {
            System.out.println("movie poster is being collected by movie fans");
        }
    }

