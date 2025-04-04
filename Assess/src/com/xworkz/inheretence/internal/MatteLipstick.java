package com.xworkz.inheretence.internal;

    public class MatteLipstick extends Lipstick {
        public void ML() {
            System.out.println("no-args constructor of MatteLipstick");
        }

        {
            super.apply();
            System.out.println("apply matte lipstick on lips");
        }

        {
            super.remove();
            System.out.println("remove matte lipstick from lips");
        }

        {
            super.smoothFinish();
            System.out.println("smooth matte finish for lipstick");
        }

        {
            super.longLasting();
            System.out.println("long-lasting matte effect of lipstick");
        }

        {
            super.shimmerEffect();
            System.out.println("add shimmer effect to matte lipstick");
        }
    }

