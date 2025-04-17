package com.xworkz.Interface.internal;

    public class User implements Instagram {

        private String username;

        public User(String username) {
            this.username = username;
        }

        @Override
        public void postPhoto(String photo) {
            System.out.println(username + " posted a photo: " + photo);
        }

        @Override
        public void likePhoto(String photo) {
            System.out.println(username + " liked the photo: " + photo);
        }

        @Override
        public void followUser(String user) {
            System.out.println(username + " followed " + user);
        }
    }

