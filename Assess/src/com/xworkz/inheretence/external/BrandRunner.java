package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Brand;
import com.xworkz.inheretence.internal.LuxuryBrand;

public class BrandRunner {
        public static void main(String[] args) {
            Brand brand = new LuxuryBrand();
            brand.marketPosition();

            Brand basicBrand = new Brand();
        }
    }

