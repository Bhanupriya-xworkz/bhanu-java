package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.Guitar;
import com.xworkz.Twointerface.Internal.Instrument;

public class InstrumentMain {

        public static void main(String[] args) {

            Instrument instrument1 = new Guitar();
            Instrument instrument2 = new Drum();

            instrument1.play();
            instrument2.tune();

            Sound sound1 = new Guitar();
            Sound sound2 = new Drum();

            sound1.volumeLevel();
            sound2.soundType();
        }
    }

