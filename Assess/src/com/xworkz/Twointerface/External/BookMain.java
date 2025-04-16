package com.xworkz.Twointerface.External;

public class BookMain {
        public static void main(String[] args) {

            Book book1 = new FictionBook();
            Book book2 = new AcademicBook();

            book1.getTitle();
            book2.getAuthor();

            Publisher publisher1 = new FictionBook();
            Publisher publisher2 = new AcademicBook();

            publisher1.getPublisherName();
            publisher2.getYearPublished();
        }
    }

