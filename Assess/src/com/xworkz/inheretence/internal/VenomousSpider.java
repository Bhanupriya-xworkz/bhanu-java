package com.xworkz.inheretence.internal;

    public class VenomousSpider extends Spider {
        public void venomousSpiderInfo() {
            System.out.println("This is a venomous spider, known for having venom that it uses to immobilize or kill prey.");
        }

        {
            super.spiderHabitat();
            System.out.println("Venomous spiders are often found in places where prey is abundant, such as forests or gardens.");
        }

        {
            super.spiderDiet();
            System.out.println("Venomous spiders use their venom to paralyze or kill their prey before consuming it.");
        }

        {
            super.spiderMovement();
            System.out.println("Venomous spiders are generally skilled hunters and can move quickly to capture prey.");
        }

        {
            super.spiderReproduction();
            System.out.println("Venomous spiders also lay eggs, which can hatch into dangerous spiderlings.");
        }
    }

