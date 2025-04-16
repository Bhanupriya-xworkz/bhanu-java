package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Camera;
import com.xworkz.Interface.internal.Dslr;

    public class CameraMain {
        public static void main(String[] args) {
            Camera camera1 = new Dslr();
            camera1.focus();
            camera1.clickPhoto();
            camera1.preview();
        }
    }

