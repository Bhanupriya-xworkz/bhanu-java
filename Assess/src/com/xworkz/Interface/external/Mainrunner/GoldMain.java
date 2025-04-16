package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Gold;
import com.xworkz.Interface.internal.GoldRing;

public class GoldMain {
        public static void main(String[] args) {

            Gold gold1 = new GoldRing();
            Gold gold2 = new GoldRing();
            Gold gold3 = new GoldRing();

            gold1.melt();
            gold2.polish();
            gold3.checkPurity();
        }
    }

