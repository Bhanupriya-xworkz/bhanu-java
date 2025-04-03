package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.DigitalDoll;
import com.xworkz.inheretence.internal.Doll;

public class DollRunner {
        public static void main(String[] args) {

            Doll digitalDoll = new DigitalDoll();

            Doll traditionalDoll = new Doll();

            digitalDoll.dressUp();
            digitalDoll.playWith();
            digitalDoll.interactWithVoice();
            digitalDoll.customizeAppearance();

            traditionalDoll.dressUp();
            traditionalDoll.playWith();
        }
    }
