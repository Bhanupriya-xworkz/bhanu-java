package com.xworkz.assignment.internal.veriable3;

    public class App {
        private String name;
        private double version;
        private boolean isFree;

        public App() {
            System.out.println("Running non-arg constructor App");
            System.out.println("name: " + this.name);
            this.name = "ChatApp";
            this.version = 1.0;
            this.isFree = true;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Version: " + version + ", IsFree: " + isFree;
        }

        @Override
        public int hashCode() {
            System.out.println("AppHashCode: " + super.hashCode());
            return 3033;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setVersion(double version) {
            this.version = version;
        }

        public void setFree(boolean isFree) {
            this.isFree = isFree;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof App) {
                    System.out.println("Have reference. Will compare...");
                    App a1 = this;
                    App a2 = (App) obj;
                    if (a1.name.equals(a2.name) &&
                            a1.version == a2.version &&
                            a1.isFree == a2.isFree) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

