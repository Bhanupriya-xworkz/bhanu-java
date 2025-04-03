package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.DigitalMessage;
import com.xworkz.inheretence.internal.Message;

public class MessageRunner {
        public static void main(String[] args) {
            // Creating an instance of DigitalMessage using Message reference
            Message digitalMessage = new DigitalMessage();

            // Creating an instance of Message
            Message traditionalMessage = new Message();
        }
    }
