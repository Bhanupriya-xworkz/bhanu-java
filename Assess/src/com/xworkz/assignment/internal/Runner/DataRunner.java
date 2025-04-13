package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable.Data;

public class DataRunner {
        public static void main(String[] args) {
            Data d = new Data();
            System.out.println(d);
            System.out.println(new Data().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(d));

            Data data1 = new Data();
            data1.setValid(true);
            Data data2 = new Data();
            data2.setValid(false);
            boolean same = data1.equals(data2);
            System.out.println("both same: " + same);
        }
    }

