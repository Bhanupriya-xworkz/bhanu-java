package com.xworkz.Interface.internal;

    public class UserMessage implements Message{
        @Override
        public void sendMessage(String message) {
            System.out.println("message");
        }

        @Override
        public void readMessage() {
            System.out.println( " is reading a message.");
        }

        @Override
        public void deleteMessage() {
            System.out.println( " deleted a message.");
        }
    }

