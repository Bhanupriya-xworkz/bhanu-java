package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Developer;
import com.xworkz.Interface.internal.Employee;

    public class EmployeeMain {
        public static void main(String[] args) {
            Employee emp1 = new Developer();
            Employee emp2 = new Developer();
            Employee emp3 = new Developer();

            emp1.work();
            emp2.takeBreak();
            emp3.report();
            emp4.companyPolicy();
        }
    }

