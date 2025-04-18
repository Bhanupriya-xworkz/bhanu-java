package com.xworkz.Interface.internal;

    public class Googlesearch implements Google {

        @Override
        public void search(String query) {
            System.out.println("Searching Google for: " + query);
        }

        @Override
        public void viewResults() {
            System.out.println("Displaying top search results...");
        }

        @Override
        public void showAdvertisements() {
            System.out.println("Showing targeted ads based on search query.");
        }
    }
    @Override
    public void tipsForSearching() {
        System.out.println("Google Search Tip: Use quotation marks to search for an exact phrase.");
    }
}

