package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.DigitalMovieTheater;
import com.xworkz.inheretence.internal.MovieTheater;

public class MovieTheaterRunner {
        public static void main(String[] args) {
            // Creating an instance of DigitalMovieTheater using MovieTheater reference
            MovieTheater digitalMovieTheater = new DigitalMovieTheater();

            // Creating an instance of MovieTheater
            MovieTheater traditionalMovieTheater = new MovieTheater();
        }
    }

