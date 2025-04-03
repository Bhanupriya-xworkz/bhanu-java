package com.xworkz.inheretence.internal;

    public class DigitalMovieTheater extends MovieTheater {

        public DigitalMovieTheater() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalMovieTheater constructor");
        }

        @Override
        public void checkSeats() {
            super.checkSeats();
            System.out.println("Checking the availability of seats in the Digital Movie Theater (online booking system)...");
        }

        @Override
        public void playMovie() {
            super.playMovie();
            System.out.println("Playing the movie in a Digital Movie Theater with digital projectors...");
        }

        @Override
        public void checkSoundQuality() {
            super.checkSoundQuality();
            System.out.println("Checking the advanced sound quality in the Digital Movie Theater (surround sound, Dolby Atmos)... ");
        }

        @Override
        public void checkScreenResolution() {
            super.checkScreenResolution();
            System.out.println("Checking the ultra-high-definition screen resolution in the Digital Movie Theater...");
        }

        @Override
        public void manageTicketBooking() {
            super.manageTicketBooking();
            System.out.println("Managing digital ticket bookings via a website or mobile app...");
        }
    }
