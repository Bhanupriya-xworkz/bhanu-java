package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Dustbin;
import com.xworkz.inheretence.internal.TrashBin;

public class DustbinRunner {
        public static void main(String[] args) {
            // Creating an object of TrashBin (which is a subclass of Dustbin)
            Dustbin dustbin = new TrashBin();
            Dustbin basicDustbin = new Dustbin();

            // Using basic dustbin operations
            basicDustbin.open();
            basicDustbin.close();
            basicDustbin.clean();
            basicDustbin.empty();

            // Using TrashBin operations
            TrashBin trashBin = new TrashBin();
            trashBin.separateWaste();
            trashBin.deodorize();
            trashBin.open();
        }
    }

