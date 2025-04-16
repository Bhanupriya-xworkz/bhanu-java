package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Product;
import com.xworkz.Interface.internal.SmartphoneProduct;

    public class ProductMain {
        public static void main(String[] args) {
            Product product1 = new SmartphoneProduct();
            Product product2 = new SmartphoneProduct();
            Product product3 = new SmartphoneProduct();

            product1.displayProductDetails();
            product2.applyDiscount();
            product3.checkAvailability();
        }
    }

