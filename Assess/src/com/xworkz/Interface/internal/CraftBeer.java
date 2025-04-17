package com.xworkz.Interface.internal;

    public class CraftBeer implements Beer {

        @Override
        public void pour() {
            System.out.println("Pouring craft beer into a chilled glass...");
        }

        @Override
        public void drink() {
            System.out.println("Sipping the smooth, hoppy flavor of craft beer.");
        }

        @Override
        public void getAlcoholContent() {
            System.out.println("Alcohol Content: 5.5%");
        }
    }
    @Override
    public void drinkResponsiblyMessage() {
        System.out.println("Craft Beer Tip: Sip slowly and enjoy the flavor profile. Know your limit!");
    }

