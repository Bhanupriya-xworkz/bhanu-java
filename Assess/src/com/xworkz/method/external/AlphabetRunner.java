package com.xworkz.method.external;

import com.xworkz.inheretence.internal.Alphabet;
import com.xworkz.method.internal.SmartAlphabet;

public class SmartAlphabetRunner {
    public static void main(String[] args) {
            Alphabet alphabet1 = new Alphabet();
            alphabet1.display();
            alphabet1.recognize();
            alphabet1.arrange();
            alphabet1.teach();
            alphabet1.trace();
            alphabet1.memorize();

            System.out.println("=============");

            SmartAlphabet smartAlphabet = new SmartAlphabet();
            smartAlphabet.display();
            smartAlphabet.recognize();
            smartAlphabet.arrange();
            smartAlphabet.teach();
            smartAlphabet.trace();
            smartAlphabet.memorize();
        }
    }

