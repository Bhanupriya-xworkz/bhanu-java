package com.xworkz.inheretence.internal;

    public class FullName extends Name {
        public void fullNameInfo() {
            System.out.println("This is a full name, typically including a first name, middle name, and last name.");
        }

        {
            super.nameLength();
            System.out.println("A full name includes multiple components such as the first name, middle name, and last name.");
        }

        {
            super.nameOrigin();
            System.out.println("Full names are often influenced by cultural naming conventions, including the use of surnames.");
        }

        {
            super.nameMeaning();
            System.out.println("The components of a full name may have different meanings based on cultural and family traditions.");
        }

        {
            super.nameUsage();
            System.out.println("Full names are used in formal contexts such as legal documents and official identification.");
        }
    }

