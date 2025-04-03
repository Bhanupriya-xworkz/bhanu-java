package com.xworkz.inheretence.internal;

    public class PaintColor extends Color {
        public void PC()
        {
            System.out.println("no-args const of paint color");
        }

        {
            super.mix();
            System.out.println("mixing paint colors for a custom shade");
        }

        {
            super.apply();
            System.out.println("applying paint color on canvas or wall");
        }

        {
            super.blend();
            System.out.println("blending paint colors for a smooth transition");
        }

        {
            super.dry();
            System.out.println("paint color is drying and setting");
        }

        public void shadeVariation()
        {
            System.out.println("adjusting the shade variation of the paint color");
        }

        public void finish()
        {
            System.out.println("giving the paint a finishing touch");
        }
    }

