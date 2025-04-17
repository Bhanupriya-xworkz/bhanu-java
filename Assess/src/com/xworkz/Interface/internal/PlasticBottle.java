package com.xworkz.Interface.internal;

    public class PlasticBottle implements Plastic {

        @Override
        public void melt() {
            System.out.println("Melting plastic bottle at 260°C...");
        }

        @Override
        public void recycle() {
            System.out.println("Recycling plastic into reusable material.");
        }

        @Override
        public void showType() {
            System.out.println("Plastic Type: PET (Polyethylene Terephthalate)");
        }
    }

    @Override
    public void plasticTip() {
        System.out.println("Plastic Tip: Avoid single-use plastics to help protect the environment.");
    }

