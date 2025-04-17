package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Message;
import com.xworkz.Interface.internal.UserMessage;

public class MessageMain {
        public static void main(String[] args) {

            Message.MessagingService user1 = new UserMessage("Alice");
            user1.sendMessage("Hello Bob! How are you?");
            user1.readMessage();
            user1.deleteMessage();


        }
    }

