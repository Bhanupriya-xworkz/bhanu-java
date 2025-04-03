package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.FountainPen;
import com.xworkz.inheretence.internal.Pen;

public class PenRunner {
        public static void main(String[] args) {
            // Creating an object of FountainPen (which is a subclass of Pen)
            Pen pen = new FountainPen();
            Pen basicPen = new Pen();

            // Using basic pen operations
            basicPen.write();
            basicPen.refill();
            basicPen.cap();
            basicPen.uncapped();

            // Using FountainPen operations
            FountainPen fountainPen = new FountainPen();
            fountainPen.adjustNib();
            fountainPen.clean();
            fountainPen.write();
        }
    }

