package com.xworkz.inheretence.external;
import com.xworkz.inheretence.internal.MoviePoster;
import com.xworkz.inheretence.internal.Poster;

public class PosterRunner {
        public static void main(String[] args) {
            // Creating an object of MoviePoster (which is a subclass of Poster)
            Poster poster = new MoviePoster();
            Poster basicPoster = new Poster();

            // Using basic poster operations
            basicPoster.create();
            basicPoster.print();
            basicPoster.display();
            basicPoster.store();

            // Using MoviePoster operations
            MoviePoster moviePoster = new MoviePoster();
            moviePoster.advertise();
            moviePoster.collect();
            moviePoster.create();
        }
    }

