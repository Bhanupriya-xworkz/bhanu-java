package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Destination;
import com.xworkz.Interface.internal.Root;

public class RootMain {

        public static void main(String[] args) {
            Root root1 = new Destination();
            Root root2 = new Destination();
            Root root3 = new Destination();

            root1.setCoordinates();
            root2.showDetails();
            root3.markVisited();

            root.rootTip();
        }
    }

