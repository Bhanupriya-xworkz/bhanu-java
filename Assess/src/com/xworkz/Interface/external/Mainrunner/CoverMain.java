package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.BookCover;
import com.xworkz.Interface.internal.Cover;

public class CoverMain {
        public static void main(String[] args) {

            Cover cover1 = new BookCover();
            Cover cover2 = new BookCover();
            Cover cover3 = new BookCover();

            cover1.open();
            cover2.showMaterial();
            cover3.close();
            Cover.careInstructions();
        }
    }

