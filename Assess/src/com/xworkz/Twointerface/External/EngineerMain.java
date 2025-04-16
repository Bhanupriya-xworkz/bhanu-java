package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.Engineer;
import com.xworkz.Twointerface.Internal.Person;

public class EngineerMain {
        public static void main(String[] args) {
            Person p1 = new Engineer();
            Person p2 = new Teacher();

            p1.getName();
            p2.getAge();

            Job j1 = new Engineer();
            Job j2 = new Teacher();

            j1.getJobTitle();
            j2.getSalary();
        }
    }

