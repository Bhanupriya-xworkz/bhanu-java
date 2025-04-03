package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.PaintColor;
import com.xworkz.inheretence.internal.Color;

public class ColorRunner {
        public static void main(String[] args) {
            // Creating an object of PaintColor (which is a subclass of Color)
            Color color = new PaintColor();
            Color basicColor = new Color();

            // Using basic color operations
            basicColor.mix();
            basicColor.apply();
            basicColor.blend();
            basicColor.dry();

            // Using PaintColor operations
            PaintColor paintColor = new PaintColor();
            paintColor.shadeVariation();
            paintColor.finish();
            paintColor.mix();
        }
    }
