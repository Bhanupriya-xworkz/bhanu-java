package com.xworkz.inheretence.external;
import com.xworkz.inheretence.internal.Spider;
import com.xworkz.inheretence.internal.VenomousSpider;

public class SpiderRunner {
        public static void main(String[] args) {
            Spider spider = new VenomousSpider();
            spider.spiderHabitat();

            Spider basicSpider = new Spider();
        }
    }
