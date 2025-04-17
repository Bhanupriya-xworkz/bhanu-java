package com.xworkz.Interface.external.Mainrunner;
import com.xworkz.Interface.internal.Plastic;
import com.xworkz.Interface.internal.PlasticBottle;

public class PlasticMain {
        public static void main(String[] args) {

            Plastic plastic1 = new PlasticBottle();
            Plastic plastic2 = new PlasticBottle();
            Plastic plastic3 = new PlasticBottle();

            plastic1.melt();
            plastic2.showType();
            plastic3.recycle();

            plastic.plasticTip();
        }
    }

