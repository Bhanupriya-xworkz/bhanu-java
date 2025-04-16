package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.Artist;
import com.xworkz.Twointerface.Internal.Painter;

public class ArtistMain {

        public static void main(String[] args) {
            Artist a1 = new Painter();
            Artist a2 = new Sculptor();

            a1.getName();
            a2.getFamousWork();

            ArtStyle s1 = new Painter();
            ArtStyle s2 = new Sculptor();

            s1.getStyleName();
            s2.getPeriod();
        }
    }

