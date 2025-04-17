package com.xworkz.Interface.internal;

    public interface Google {
        void search();
        void viewResults();
        void showAdvertisements();

        default void tipsForSearching() {
            System.out.println("General Tip: Use specific keywords and operators for more accurate search results.");
        }
    }

