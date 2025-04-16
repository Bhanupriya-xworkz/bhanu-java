package com.xworkz.Interface.internal;

    public class ShoppingMall implements Mall {

        @Override
        public void openMall() {
            System.out.println("Mall is now open.");
        }

        @Override
        public void closeMall() {
            System.out.println("Mall is now closed.");
        }

        @Override
        public void showShops() {
            System.out.println("Shops: Clothing, Electronics, Food Court, Bookstore.");
        }
    }

