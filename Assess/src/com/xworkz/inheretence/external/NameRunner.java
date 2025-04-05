package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.FullName;
import com.xworkz.inheretence.internal.Name;

public class NameRunner {
        public static void main(String[] args) {
            Name name = new FullName();  // Polymorphism: A FullName object is treated as a Name
            name.nameLength();  // Calls the overridden method from FullName

            Name basicName = new Name();  // Creating an object of the base class Name
        }
    }

