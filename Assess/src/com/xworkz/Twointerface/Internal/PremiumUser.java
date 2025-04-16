package com.xworkz.Twointerface.Internal;

    public class PremiumUser implements User, Subscription {

        @Override
        public void getUsername() {
            System.out.println("Username: premium_john");
        }

        @Override
        public void getEmail() {
            System.out.println("Email: john@premium.com");
        }

        @Override
        public void getPlan() {
            System.out.println("Plan: Premium");
        }

        @Override
        public void getBenefits() {
            System.out.println("Benefits: No ads, offline access, HD quality");
        }
    }

public class FreeUser implements User, Subscription {

    @Override
    public void getUsername() {
        System.out.println("Username: free_anna");
    }

    @Override
    public void getEmail() {
        System.out.println("Email: anna@free.com");
    }

    @Override
    public void getPlan() {
        System.out.println("Plan: Free");
    }

    @Override
    public void getBenefits() {
        System.out.println("Benefits: Ads, online only, limited features");
    }
}

