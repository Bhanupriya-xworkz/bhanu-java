package com.xworkz.method.external;

public class messageRunner {

        public static void main(String[] args) {

            message basicMessage = new Message();
            basicMessage.sendMessage("Hello, this is a basic message.");
            basicMessage.receiveMessage("Hello, how are you?");
            basicMessage.displayMessage("This is a basic message display.");
            basicMessage.encodeMessage("Message needs to be encoded.");
            basicMessage.decodeMessage("Encoded message.");
            basicMessage.alert("This is a basic alert.");

            System.out.println("=============");

            SmartMessage smartMessage = new SmartMessage();
            smartMessage.sendMessage("Hello, this is an encrypted message.");
            smartMessage.receiveMessage("How are you, SmartMessage?");
            smartMessage.displayMessage("Displaying message with advanced UI.");
            smartMessage.encodeMessage("Message needs advanced encryption.");
            smartMessage.decodeMessage("Encrypted message decoded.");
            smartMessage.alert("This is a high-priority alert.");
        }
    }
