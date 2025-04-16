package com.xworkz.Twointerface.Internal;

    public class FictionBook implements Book, Publisher {

        @Override
        public void getTitle() {
            System.out.println("Title: The Time Traveler's Diary");
        }

        @Override
        public void getAuthor() {
            System.out.println("Author: R. K. Sharma");
        }

        @Override
        public void getPublisherName() {
            System.out.println("Publisher: Penguin Books");
        }

        @Override
        public void getYearPublished() {
            System.out.println("Year Published: 2021");
        }
    }


public class AcademicBook implements Book, Publisher {

    @Override
    public void getTitle() {
        System.out.println("Title: Advanced Java Programming");
    }

    @Override
    public void getAuthor() {
        System.out.println("Author: Dr. A. S. Gupta");
    }

    @Override
    public void getPublisherName() {
        System.out.println("Publisher: McGraw Hill Education");
    }

    @Override
    public void getYearPublished() {
        System.out.println("Year Published: 2023");
    }
}

