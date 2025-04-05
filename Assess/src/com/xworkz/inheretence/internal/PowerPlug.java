package com.xworkz.inheretence.internal;

    public class PowerPlug extends Plug {
        public void powerPlugInfo() {
            System.out.println("This is a power plug, used for connecting electrical devices to an electrical outlet.");
        }

        {
            super.plugTypes();
            System.out.println("Power plugs can be either two-pronged or three-pronged, depending on the appliance's power requirements.");
        }

        {
            super.material();
            System.out.println("Power plugs are commonly made of plastic for insulation, and the prongs are made of metal for conductivity.");
        }

        {
            super.safety();
            System.out.println("Power plugs often have safety features such as childproof mechanisms or fuses to prevent overloads.");
        }

        {
            super.compatibility();
            System.out.println("Power plugs must match the socket type, voltage, and current rating for safe usage.");
        }
    }

