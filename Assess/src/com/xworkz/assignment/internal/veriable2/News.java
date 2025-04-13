package com.xworkz.assignment.internal.veriable2;

    public class News {
        private String headline;
        private String category;
        private boolean isBreaking;

        public News(String headline, String category, boolean isBreaking) {
            this.headline = headline;
            this.category = category;
            this.isBreaking = isBreaking;
        }

        @Override
        public String toString() {
            return "News{headline='" + headline + "', category='" + category + "', isBreaking=" + isBreaking + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("NewsHashCode: " + super.hashCode());
            return 9999;
        }

        public void setHeadline(String headline) {
            this.headline = headline;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public void setIsBreaking(boolean isBreaking) {
            this.isBreaking = isBreaking;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof News) {
                    System.out.println("Comparing News objects...");
                    News n1 = this;
                    News n2 = (News) obj;
                    if (n1.headline.equals(n2.headline) &&
                            n1.category.equals(n2.category) &&
                            n1.isBreaking == n2.isBreaking) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

