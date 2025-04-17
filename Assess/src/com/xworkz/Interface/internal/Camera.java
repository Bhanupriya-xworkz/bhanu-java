package com.xworkz.Interface.internal;

    public interface Camera {
        void focus();
        void clickPhoto();
        void preview();
        default void cameraTips() {
            System.out.println("General Camera Tip: Clean your lens regularly for sharp images.");
        }
    }

