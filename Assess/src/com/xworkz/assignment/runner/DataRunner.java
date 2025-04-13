package com.xworkz.assignment.runner;
import com.xworkz.assignment.internal.veriable.Data;

public class DataRunner {
        public static void main(String[] args) {
            Data d = new Data();
            System.out.println(d);
            System.out.println(new Data().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(d));

            Data data1 = new Data();
            data1.setValue("Hello");
            Data data2 = new Data();
            data2.setValue("World");
            boolean same = data1.equals(data2);
            System.out.println("both same:" + same);
        }
    }

