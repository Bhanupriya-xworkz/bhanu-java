package com.xworkz.Interface.external.Mainrunner;
import com.xworkz.Interface.internal.Googlesearch;
import com.xworkz.Interface.internal.Google;

public class GoogleMain {
        public static void main(String[] args) {

            Google google1 = new GoogleSearch();
            Google google2 = new GoogleSearch();
            Google google3 = new GoogleSearch();

            google1.search();
            google2.viewResults();
            google3.showAdvertisements();
            Google.tipsForSearching();
        }
    }

