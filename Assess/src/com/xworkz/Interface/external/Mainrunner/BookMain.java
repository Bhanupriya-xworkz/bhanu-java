package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Book;
import com.xworkz.Interface.internal.StoryBook;

public class BookMain {
        public static void main(String[] args) {
            Book book1 = new StoryBook();
            Book book2 = new StoryBook();
            Book book3 = new StoryBook();

            book1.open();
            book2.read();
            book3.close();
        }
    }

