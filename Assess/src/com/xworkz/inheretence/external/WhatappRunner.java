package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.BusinessWhatsapp;
import com.xworkz.inheretence.internal.Whatsapp;

public class WhatsappRunner {
        public static void main(String[] args) {
            WhatsApp whatsApp = new BusinessWhatsApp();
            whatsApp.messaging();

            Whatsapp basicWhatsApp = new Whatsapp();
        }
    }

