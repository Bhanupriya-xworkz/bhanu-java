package com.xworkz.assignment.internal.veriable;

    public class News {
        private String headline;
        private String source;
        private boolean isBreaking;

        public News() {
            System.out.println("Running no-arg constructor of News");
            this.headline = "Breaking News: World Peace Achieved!";
            this.source = "Global News Network";
            this.isBreaking = true;
        }

        @Override
        public String toString() {
            return "Headline: " + headline + ", Source: " + source + ", Is Breaking: " + isBreaking;
        }

        @Override
        public int hashCode() {
            System.out.println("NewsHashCode" + super.hashCode());
            return 330;
        }

        public void setHeadline(String headline) {
            this.headline = headline;
        }

        public void setSource(String source) {
            this.source = source;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof News) {
                    System.out.println("have ref. will compare..");
                    News news1 = this;
                    News news2 = (News) obj;
                    if (news1.headline.equals(news2.headline)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

