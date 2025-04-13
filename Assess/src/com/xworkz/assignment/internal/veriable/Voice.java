package com.xworkz.assignment.internal.veriable;

    public class Voice {
        private String language;
        private double volume;
        private boolean isClear;

        public Voice() {
            System.out.println("Running no-arg constructor of Voice");
            this.language = "English";
            this.volume = 70.0;
            this.isClear = true;
        }

        @Override
        public String toString() {
            return "Language: " + language + ", Volume: " + volume + " dB, Is Clear: " + isClear;
        }

        @Override
        public int hashCode() {
            System.out.println("VoiceHashCode" + super.hashCode());
            return 320;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Voice) {
                    System.out.println("have ref. will compare..");
                    Voice voice1 = this;
                    Voice voice2 = (Voice) obj;
                    if (voice1.language.equals(voice2.language)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

