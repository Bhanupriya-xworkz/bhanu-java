package com.xworkz.method.internal;

    public class LanguagePlatform extends Language {

        public void supportCommunity() {
            System.out.println("LanguagePlatform offers community support.");
        }

        public void Dbc(Language language) {
            language.speak();
            language.write();
            language.read();
            language.translate();
            language.learn();

            if (language instanceof LanguagePlatform) {
                LanguagePlatform platform = (LanguagePlatform) language;
                System.out.println("Language is an instance of LanguagePlatform.");
                platform.supportCommunity();
            }
        }
    }

