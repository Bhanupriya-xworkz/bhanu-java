package com.xworkz.Interface.external.Mainrunner;
import com.xworkz.Interface.external.phone;
import com.xworkz.Interface.internal.Phone;

public class SmartphoneMain {
        public static void main(String[] args) {

            Phone phone1 = new SmartPhone();
            Phone phone2 = new SmartPhone();
            Phone phone3 = new SmartPhone();

            phone1.makeCall();
            phone2.sendMessage();
            phone3.browseInternet();
        }
    }

