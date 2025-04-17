package com.xworkz.Interface.internal;

    public interface Instagram {
        void postPhoto(String photo);
        void likePhoto(String photo);
        void followUser(String user);

        default void instagramTips() {
            System.out.println("General Tip: Use relevant hashtags to increase engagement on your posts.");
        }
    }

