package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.English;
import com.xworkz.Twointerface.Internal.Language;

public class LanguageMain {

    public class MainClass {
        public static void main(String[] args) {
            Language lang1 = new English();
            Language lang2 = new Spanish();

            lang1.speak();
            lang2.alphabetType();

            Country country1 = new English();
            Country country2 = new Spanish();

            country1.getCountryName();
            country2.getContinent();
        }
    }
}


