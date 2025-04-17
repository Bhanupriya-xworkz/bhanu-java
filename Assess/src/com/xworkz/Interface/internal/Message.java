package com.xworkz.Interface.internal;

public class Message {
    public interface MessagingService {
        void sendMessage(String message);
        void readMessage();
        void deleteMessage();
    }

}
