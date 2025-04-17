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
    @Override
    public void subscriptionTip() {
        System.out.println("Streaming Tip: Download content for offline viewing and avoid buffering.");
    }

