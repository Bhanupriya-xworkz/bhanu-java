package com.xworkz.inheretence.internal;

    public class DigitalCamera extends Camera {
        public void DC()
        {
            System.out.println("no-args const of digital camera");
        }

        {
            super.capture();
            System.out.println("capturing high-quality image with digital camera");
        }

        {
            super.zoom();
            System.out.println("zooming in or out with digital camera for clear shots");
        }

        {
            super.focus();
            System.out.println("focusing the digital camera lens for sharper pictures");
        }

        {
            super.record();
            System.out.println("recording HD video with digital camera");
        }

        public void applyFilter()
        {
            System.out.println("applying filter to the image on digital camera");
        }

        public void setResolution()
        {
            System.out.println("setting resolution on the digital camera for better clarity");
        }
    }

