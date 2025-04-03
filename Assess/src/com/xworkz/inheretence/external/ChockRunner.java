package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Chock;
import com.xworkz.inheretence.internal.RubberChock;

public class ChockRunner {
        public static void main(String[] args) {
            // Creating an object of RubberChock (which is a subclass of Chock)
            Chock chock = new RubberChock();
            Chock basicChock = new Chock();

            // Using basic chock operations
            basicChock.secure();
            basicChock.release();
            basicChock.adjust();
            basicChock.inspect();

            // Using RubberChock operations
            RubberChock rubberChock = new RubberChock();
            rubberChock.preventSlippage();
            rubberChock.increaseGrip();
            rubberChock.secure();
        }
    }

