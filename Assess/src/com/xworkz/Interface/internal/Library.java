package com.xworkz.Interface.internal;

    public class Library implements LibraryOperations {

        @Override
        public void issueBook(String bookTitle) {
            System.out.println("The book '" + bookTitle + "' has been issued.");
        }

        @Override
        public void returnBook(String bookTitle) {
            System.out.println("The book '" + bookTitle + "' has been returned.");
        }

        @Override
        public void searchBook(String bookTitle) {
            System.out.println("Searching for the book: '" + bookTitle + "'");
            System.out.println("The book '" + bookTitle + "' is available in the library.");
        }
    }

    @Override
    public void libraryTips() {
        System.out.println("Library Tip: Use the online catalog to reserve books in advance and avoid waiting.");
    }

