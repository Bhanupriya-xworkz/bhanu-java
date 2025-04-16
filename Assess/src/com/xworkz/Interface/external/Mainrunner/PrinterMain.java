package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Printer;
import com.xworkz.Interface.internal.InkjetPrinter;

    public class PrinterMain {
        public static void main(String[] args) {
            Printer printer1 = new InkjetPrinter();
            printer1.loadPaper();
            printer1.printDocument();
            printer1.ejectPaper();
        }
    }

