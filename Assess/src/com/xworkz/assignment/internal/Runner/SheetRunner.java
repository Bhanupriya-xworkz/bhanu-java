package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable.Sheet;

public class SheetRunner {
        public static void main(String[] args) {
            Sheet s = new Sheet();
            System.out.println(s);
            System.out.println(new Sheet().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(s));

            Sheet sheet1 = new Sheet();
            sheet1.setWritable(true);
            Sheet sheet2 = new Sheet();
            sheet2.setWritable(false);
            boolean same = sheet1.equals(sheet2);
            System.out.println("both same: " + same);
        }
    }

