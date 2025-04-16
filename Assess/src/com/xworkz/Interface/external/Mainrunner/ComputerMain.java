package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Computer;
import com.xworkz.Interface.internal.Laptop;

    public class ComputerMain {
        public static void main(String[] args) {
            Computer computer1 = new Laptop();
            computer1.powerOn();
            computer1.runProgram();
            computer1.shutDown();
        }
    }

