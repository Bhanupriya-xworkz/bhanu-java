package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Library;
import com.xworkz.Interface.internal.LibraryOperations;

public class LibraryMain {
        public static void main(String[] args) {
            LibraryOperations library = new Library();

            library.issueBook("Java Programming");

            library.returnBook("Java Programming");

            library.searchBook("Data Structures");
        }
    }

