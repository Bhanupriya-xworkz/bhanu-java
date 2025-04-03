package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Camera;
import com.xworkz.inheretence.internal.DigitalCamera;

public class CameraRunner {
        public static void main(String[] args) {
            // Creating an object of DigitalCamera (which is a subclass of Camera)
            Camera camera = new DigitalCamera();
            Camera basicCamera = new Camera();

            // Using basic camera operations
            basicCamera.capture();
            basicCamera.zoom();
            basicCamera.focus();
            basicCamera.record();

            // Using DigitalCamera operations
            DigitalCamera digitalCamera = new DigitalCamera();
            digitalCamera.applyFilter();
            digitalCamera.setResolution();
            digitalCamera.capture();
        }
    }

