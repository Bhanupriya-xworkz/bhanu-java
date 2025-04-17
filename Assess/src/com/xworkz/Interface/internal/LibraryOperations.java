package com.xworkz.Interface.internal;

    public interface LibraryOperations {
        void issueBook(String bookTitle);
        void returnBook(String bookTitle);
        void searchBook(String bookTitle);

        default void libraryTips() {
            System.out.println("General Tip: Return books on time to avoid late fees and help others enjoy them too.");
        }
    }

