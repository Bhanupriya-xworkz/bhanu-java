package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.DigitalPaper;
import com.xworkz.inheretence.internal.Paper;

public class PaperRunner {
        public static void main(String[] args) {
            Paper paper = new DigitalPaper();

            Paper basicPaper = new Paper();

            paper.checkSize();
            paper.checkQuality();
            paper.printOnPaper();
            paper.foldPaper();
            paper.storePaper();
            ((DigitalPaper) paper).shareDigitally();
            ((DigitalPaper) paper).addAnnotations();
            ((DigitalPaper) paper).deleteContent();

            basicPaper.checkSize();
            basicPaper.checkQuality();
            basicPaper.printOnPaper();
        }
    }
