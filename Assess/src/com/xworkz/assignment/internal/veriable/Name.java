package com.xworkz.assignment.internal.veriable;

    public class Name {
        private String firstName;
        private String lastName;
        private boolean isFullName;

        public Name() {
            System.out.println("Running no-arg constructor of Name");
            this.firstName = "John";
            this.lastName = "Doe";
            this.isFullName = true;
        }

        @Override
        public String toString() {
            return "First Name: " + firstName + ", Last Name: " + lastName + ", Is Full Name: " + isFullName;
        }

        @Override
        public int hashCode() {
            System.out.println("NameHashCode" + super.hashCode());
            return 25;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Name) {
                    System.out.println("have ref. will compare..");
                    Name name1 = this;
                    Name name2 = (Name) obj;
                    if (name1.firstName.equals(name2.firstName)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

