package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.SoundSpeaker;
import com.xworkz.Interface.internal.Speaker;;

    public class SpeakerMain {
        public static void main(String[] args) {
            Speaker speaker1 = new SoundSpeaker();
            speaker1.connect();
            speaker1.playMusic();
            speaker1.disconnect();
        }
    }

