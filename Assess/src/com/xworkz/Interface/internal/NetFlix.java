package com.xworkz.Interface.internal;

    public class NetFlix implements StreamingService {

        @Override
        public void login() {
            System.out.println("Logging into Netflix...");
        }

        @Override
        public void playContent() {
            System.out.println("Streaming 'Stranger Things' on Netflix.");
        }

        @Override
        public void logout() {
            System.out.println("Logged out of Netflix.");
        }
    }

