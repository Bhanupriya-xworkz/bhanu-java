package com.xworkz.inheretence.internal;

    public class EmailNotification extends Notification {
        public void EN()
        {
            System.out.println("no-args const of email notification");
        }

        {
            super.send();
            System.out.println("email notification is being sent to the inbox");
        }

        {
            super.receive();
            System.out.println("email notification is being received and added to the inbox");
        }

        {
            super.read();
            System.out.println("email notification is being read by the user");
        }

        {
            super.delete();
            System.out.println("email notification is being deleted from the inbox");
        }

        public void markAsRead()
        {
            System.out.println("email notification is being marked as read");
        }

        public void forward()
        {
            System.out.println("email notification is being forwarded to another recipient");
        }
    }

