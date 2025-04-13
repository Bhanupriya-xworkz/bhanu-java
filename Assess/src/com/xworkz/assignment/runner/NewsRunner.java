package com.xworkz.assignment.runner;
import com.xworkz.assignment.internal.veriable.News;

public class NewsRunner {
        public static void main(String[] args) {
            News n = new News();
            System.out.println(n);
            System.out.println(new News().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(n));

            News news1 = new News();
            news1.setBreaking(true);
            News news2 = new News();
            news2.setBreaking(false);
            boolean same = news1.equals(news2);
            System.out.println("both same:" + same);
        }
    }

