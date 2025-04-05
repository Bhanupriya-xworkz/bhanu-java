package com.xworkz.inheretence.internal;

    public class LuxurySofa extends Sofa {
        public void luxurySofaInfo() {
            System.out.println("This is a luxury sofa, crafted with high-end materials and designed for maximum comfort.");
        }

        {
            super.sofaTypes();
            System.out.println("Luxury sofas often feature premium materials like fine leather, velvet, and high-quality foam.");
        }

        {
            super.sofaMaterial();
            System.out.println("Luxury sofas are typically upholstered in materials such as silk, velvet, or top-grain leather.");
        }

        {
            super.sofaComfort();
            System.out.println("Luxury sofas are designed to offer unparalleled comfort with memory foam cushions and adjustable recliners.");
        }

        {
            super.sofaSize();
            System.out.println("Luxury sofas often come in larger sizes with additional features like built-in recliners or USB charging ports.");
        }
    }

