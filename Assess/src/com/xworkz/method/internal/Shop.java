package com.xworkz.method.internal;

    public class Shop extends Cold{
        public void Polarbear(){
            System.out.println("the polar bear has ice cream");
}
public void Dbc(Cold cold){
        cold.scoop();
        cold.melt();
        cold.freeze();
        cold.eat();
        cold.flavorMix();

        if(cold instanceof Shop){
            Shop shop=(Shop) cold;
            System.out.println("the shop instance of the cold");
             shop.Polarbear();
        }
        }
    }
