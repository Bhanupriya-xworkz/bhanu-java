package com.xworkz.method.external;
import com.xworkz.method.internal.Language;
import com.xworkz.method.internal.ProgrammingLanguage;

public class LanguageRunner {
        public static void main(String[] args) {

            System.out.println("Using ProgrammingLanguage object:");
            ProgrammingLanguage pl = new ProgrammingLanguage();
            pl.speak();
            pl.write();
            pl.read();
            pl.translate();
            pl.learn();
            pl.debug();

            System.out.println("=====================");

            Language lang = new Language();
            lang.speak();
            lang.write();
            lang.read();
            lang.translate();
            lang.learn();

            System.out.println("=====================");

            LanguagePlatform platform = new LanguagePlatform();
            platform.Dbc(lang);
            platform.Dbc(platform);
        }
    }

