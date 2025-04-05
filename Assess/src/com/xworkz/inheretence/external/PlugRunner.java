package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Plug;
import com.xworkz.inheretence.internal.PowerPlug;

public class PlugRunner {
        public static void main(String[] args) {
            Plug plug = new PowerPlug();
            plug.plugTypes();

            Plug basicPlug = new Plug();
        }
    }

