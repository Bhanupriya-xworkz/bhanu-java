package com.xworkz.inheretence.internal;

    public class BusinessWhatsApp extends WhatsApp {
        public void businessInfo() {
            System.out.println("This is WhatsApp Business, designed for businesses to connect with customers.");
        }

        {
            super.messaging();
            System.out.println("WhatsApp Business includes automated messages and quick replies.");
        }

        {
            super.voiceAndVideoCall();
            System.out.println("Business accounts can offer customer support via voice and video calls.");
        }

        {
            super.mediaSharing();
            System.out.println("Businesses can send promotional media to customers.");
        }

        {
            super.statusUpdates();
            System.out.println("Business accounts can post promotional or informative status updates.");
        }
    }

