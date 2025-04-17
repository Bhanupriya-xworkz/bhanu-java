package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Mall;
import com.xworkz.Interface.internal.ShoppingMall;

public class ShoppingMallMain {
        public static void main(String[] args) {

            Mall mall1 = new ShoppingMall();
            Mall mall2 = new ShoppingMall();
            Mall mall3 = new ShoppingMall();

            mall1.openMall();
            mall2.showShops();
            mall3.closeMall();

        }
    }

