package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Product;
import com.xworkz.inheretence.internal.DigitalProduct;

public class ProductRunner {
        public static void main(String[] args) {
            // Creating an instance of DigitalProduct using Product reference
            Product digitalProduct = new DigitalProduct();

            // Creating an instance of Product
            Product physicalProduct = new Product();
        }
    }
