package com.xworkz.Twointerface.Internal;


    public class Architecture implements Building, Architecture {

        @Override
        public void getName() {
            System.out.println("Building: Sky Tower");
        }

        @Override
        public void getFloors() {
            System.out.println("Floors: 60");
        }

        @Override
        public void getStyle() {
            System.out.println("Style: Modern Glass Tower");
        }

        @Override
        public void getMaterialUsed() {
            System.out.println("Material: Steel, Glass");
        }
    }

public class Cottage implements Building, Architecture {

    @Override
    public void getName() {
        System.out.println("Building: Cozy Cottage");
    }

    @Override
    public void getFloors() {
        System.out.println("Floors: 1");
    }

    @Override
    public void getStyle() {
        System.out.println("Style: Rustic");
    }

    @Override
    public void getMaterialUsed() {
        System.out.println("Material: Wood, Brick");
    }
}


