package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable.Phone;

public class PhoneRunner {
        public static void main(String[] args) {
            Phone p = new Phone();
            System.out.println(p);
            System.out.println(new Phone().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(p));

            Phone phone1 = new Phone();
            phone1.setPhoneNumber("123-456-7890");
            Phone phone2 = new Phone();
            phone2.setPhoneNumber("098-765-4321");
            boolean same = phone1.equals(phone2);
            System.out.println("both same: " + same);
        }
    }

