package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.EmailNotification;
import com.xworkz.inheretence.internal.Notification;

public class NotificationRunner {
        public static void main(String[] args) {
            // Creating an object of EmailNotification (which is a subclass of Notification)
            Notification notification = new EmailNotification();
            Notification basicNotification = new Notification();

            // Using basic notification operations
            basicNotification.send();
            basicNotification.receive();
            basicNotification.read();
            basicNotification.delete();

            // Using EmailNotification operations
            EmailNotification emailNotification = new EmailNotification();
            emailNotification.markAsRead();
            emailNotification.forward();
            emailNotification.send();
        }
    }

