package com.xworkz.method.external;
import com.xworkz.method.internal.SmartNumber;
import com.xworkz.method.internal.Numbers;

public class NumbersRunner {

        public static void main(String[] args) {

            Number number1 = new Numbers();
            number1.display();
            number1.add();
            number1.subtract();
            number1.multiply();
            number1.divide();
            number1.square();

            System.out.println("=============");

            SmartNumbers smartNumber = new SmartNumbers();
            smartNumber.display();
            smartNumber.add();
            smartNumber.subtract();
            smartNumber.multiply();
            smartNumber.divide();
            smartNumber.square();
        }
    }
