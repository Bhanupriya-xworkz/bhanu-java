package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.PremiumUser;
import com.xworkz.Twointerface.Internal.User;

public class UserMain {

        public static void main(String[] args) {
            User u1 = new PremiumUser();
            User u2 = new FreeUser();

            u1.getUsername();
            u2.getEmail();

            Subscription s1 = new PremiumUser();
            Subscription s2 = new FreeUser();

            s1.getPlan();
            s2.getBenefits();
        }
    }

