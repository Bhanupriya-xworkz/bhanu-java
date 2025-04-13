package com.xworkz.assignment.internal.veriable2;

public class Name {
        private String firstName;
        private String lastName;
        private String middleName;

        public Name(String firstName, String middleName, String lastName) {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "Name{firstName='" + firstName + "', middleName='" + middleName + "', lastName='" + lastName + "'}";
        }

        @Override
        public int hashCode() {
            System.out.println("NameHashCode: " + super.hashCode());
            return 1111; // Arbitrary hash code
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Name) {
                    System.out.println("Comparing Name objects...");
                    Name name1 = this;
                    Name name2 = (Name) obj;
                    if (name1.firstName.equals(name2.firstName) &&
                            name1.middleName.equals(name2.middleName) &&
                            name1.lastName.equals(name2.lastName)) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

