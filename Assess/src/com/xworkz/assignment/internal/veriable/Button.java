package com.xworkz.assignment.internal.veriable;

    public class Button {
        private String shape;
        private String color;
        private boolean isPlastic;

        public Button() {
            System.out.println("Running no-arg constructor of Button");
            this.shape = "Round";
            this.color = "Black";
            this.isPlastic = true;
        }

        @Override
        public String toString() {
            return "Shape: " + shape + ", Color: " + color + ", Is Plastic: " + isPlastic;
        }

        @Override
        public int hashCode() {
            System.out.println("ButtonHashCode" + super.hashCode());
            return 55;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Button) {
                    System.out.println("have ref. will compare..");
                    Button button1 = this;
                    Button button2 = (Button) obj;
                    if (button1.shape.equals(button2.shape)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

