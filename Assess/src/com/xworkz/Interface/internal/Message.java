package com.xworkz.Interface.internal;

public class Message {
    public interface MessagingService {
        void sendMessage(String message);
        void readMessage();
        void deleteMessage();

        default void messageTip() {
            System.out.println("General Tip: Always double-check the recipient before sending sensitive messages.");
        }
    }

}
