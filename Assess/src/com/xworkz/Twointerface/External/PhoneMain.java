package com.xworkz.Twointerface.External;

import com.xworkz.Interface.internal.Phone;
import com.xworkz.Twointerface.Internal.AndroidPhone;

public class PhoneMain {

        public static void main(String[] args) {
            Phone phone1 = new AndroidPhone();
            Phone phone2 = new iPhone();

            phone1.call();
            phone2.message();

            Network network1 = new AndroidPhone();
            Network network2 = new iPhone();

            network1.getCarrier();
            network2.getSignalStrength();
        }
    }

