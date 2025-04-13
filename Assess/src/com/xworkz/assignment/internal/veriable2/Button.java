package com.xworkz.assignment.internal.veriable2;

    public class Button {
        private String color;
        private String shape; // e.g., "Round", "Square"
        private boolean isPressed;

        public Button(String color, String shape, boolean isPressed) {
            this.color = color;
            this.shape = shape;
            this.isPressed = isPressed;
        }

        @Override
        public String toString() {
            return "Button{color=" + color + ", shape=" + shape + ", isPressed=" + isPressed + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("ButtonHashCode:" + super.hashCode());
            return 8749;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        public void setPressed(boolean isPressed) {
            this.isPressed = isPressed;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Button) {
                    System.out.println("have ref. will compare..");
                    Button button1 = this;
                    Button button2 = (Button) obj;
                    if (button1.color.equals(button2.color) && button1.shape.equals(button2.shape) && button1.isPressed == button2.isPressed) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

