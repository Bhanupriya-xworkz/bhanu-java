package com.xworkz.assignment.runner;
import com.xworkz.assignment.internal.veriable.Phone;

public class PhoneRunner {
        public static void main(String[] args) {
            Phone p = new Phone();
            System.out.println(p);
            System.out.println(new Phone().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(p));

            Phone phone1 = new Phone();
            phone1.setSmartphone(true);
            Phone phone2 = new Phone();
            phone2.setSmartphone(false);
            boolean same = phone1.equals(phone2);
            System.out.println("both same:" + same);
        }
    }

